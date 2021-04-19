package mall.controller.admin;

import mall.annotation.Auth;
import mall.controller.BaseController;
import mall.pojo.User;

/**
 * Controller基类，定义权限
 */
@Auth(User.Group.superAdmin)
public class AdminBaseController extends BaseController {

}
