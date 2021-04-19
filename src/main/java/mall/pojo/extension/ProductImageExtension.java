package mall.pojo.extension;

import mall.annotation.ORMAnnotation.JoinColumn;
import mall.annotation.ORMAnnotation.ManyToOne;
import mall.pojo.Product;
import mall.pojo.base.BasePOJO;

public class ProductImageExtension extends BasePOJO {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1532969940540342770L;
	@ManyToOne
    @JoinColumn(name = "pid")
    private Product product;

    public enum Type{
        top,detail,cover;
    }
    public String getPath(){
        return getId()+".jpg";
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

