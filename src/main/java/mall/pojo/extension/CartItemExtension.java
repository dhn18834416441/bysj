package mall.pojo.extension;

import mall.annotation.ORMAnnotation.JoinColumn;
import mall.annotation.ORMAnnotation.ManyToOne;
import mall.pojo.Product;
import mall.pojo.User;
import mall.pojo.base.BasePOJO;

public class CartItemExtension extends BasePOJO {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2676267355123013140L;
	@ManyToOne
    @JoinColumn(name = "pid")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "uid")
    private User user;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
