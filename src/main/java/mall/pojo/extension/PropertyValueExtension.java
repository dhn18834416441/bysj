package mall.pojo.extension;

import mall.annotation.ORMAnnotation.JoinColumn;
import mall.annotation.ORMAnnotation.ManyToOne;
import mall.pojo.Product;
import mall.pojo.Property;
import mall.pojo.base.BasePOJO;

public class PropertyValueExtension extends BasePOJO {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6950559900130704494L;
	@ManyToOne
    @JoinColumn(name="pid")
    private Product product;
    @ManyToOne
    @JoinColumn(name="ptid")
    private Property property;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
