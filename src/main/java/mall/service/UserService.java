package mall.service;

import mall.pojo.User;

public interface UserService extends BaseService{
    /**
     *
     * @param rawUser 从浏览器中获取的原始user
     * @return 添加入库后的行数，该方法会自动对密码进行加密
     */
    public Integer add(User rawUser) throws Exception;

    /**
     *
     * @param username 用户名
     * @return 用户名是否存在
     */
    public boolean isExist(String username) throws Exception;

    /**
     *
     * @param name 用户名
     * @param password 密码
     * @return 用户对象
     */
    public User get(String name,String password);
    
    /**
     * 
     * @param id 用户ID
     * @return 生效的行数
     */
    public Integer delete(Integer id) throws Exception;
    
    /**
     * 
     * @param user 从浏览器中获取的原始user
     * @return 修改入库后的行数，该方法会自动对密码进行加密
     */
    public Integer update(User user) throws Exception;
}