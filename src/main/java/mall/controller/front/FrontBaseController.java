package mall.controller.front;

import mall.annotation.Auth;
import mall.controller.BaseController;
import mall.pojo.User;

@Auth(User.Group.unLogin)
public class FrontBaseController extends BaseController {

}
