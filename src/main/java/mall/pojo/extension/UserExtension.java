package mall.pojo.extension;

import mall.annotation.ORMAnnotation.Enumerated;
import mall.pojo.base.BasePOJO;

public class UserExtension extends BasePOJO  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8732569818167265130L;
	@Enumerated(var = "group_")
    private Group group;

    public Group getGroup(){
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public enum Group{
        unLogin,user,admin,superAdmin;
    }
}
