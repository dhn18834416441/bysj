package mall.pojo.extension;

import java.util.List;

import mall.annotation.ORMAnnotation.JoinColumn;
import mall.annotation.ORMAnnotation.OneToMany;
import mall.pojo.Product;
import mall.pojo.base.BasePOJO;

public class CategoryExtension extends BasePOJO {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2730456192257869418L;
	@OneToMany
    @JoinColumn(name = "cid")
    private List<Product> products;


    public String getImgPath() {
        return getId() + ".jpg";
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}