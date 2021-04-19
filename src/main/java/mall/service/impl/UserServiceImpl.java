package mall.service.impl;

import org.springframework.stereotype.Service;

import mall.mapper.UserMapper;
import mall.pojo.User;
import mall.pojo.UserExample;
import mall.service.UserService;
import mall.util.PasswordUtil;


@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, UserExample> implements UserService {
    @Override
    public boolean isExist(String username) throws Exception {
        return !list("name", username).isEmpty();
    }

    @Override
    public Integer add(User user) throws Exception {
        String rawPassword = user.getPassword();
        user.setPassword(PasswordUtil.encryptPassword(rawPassword));
        return super.add(user);
    }

    @Override
    public User get(String name, String password) {
        return (User) getOne("name", name, "password", PasswordUtil.encryptPassword(password), "order","id asc");
    }

	@Override
	public Integer delete(Integer id) throws Exception {
		return delete(id);
	}

	@Override
	public Integer update(User user) throws Exception {
		return update(user);
	}
}