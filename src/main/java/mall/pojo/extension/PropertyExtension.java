package mall.pojo.extension;

import mall.annotation.ORMAnnotation.JoinColumn;
import mall.annotation.ORMAnnotation.ManyToOne;
import mall.pojo.Category;
import mall.pojo.base.BasePOJO;

public class PropertyExtension extends BasePOJO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2847353407842615652L;
	@ManyToOne
    @JoinColumn(name="cid")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
