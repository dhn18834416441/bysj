package mall.pojo.extension;

import java.util.List;

import mall.annotation.ORMAnnotation.JoinColumn;
import mall.annotation.ORMAnnotation.ManyToOne;
import mall.annotation.ORMAnnotation.OneToMany;
import mall.pojo.Category;
import mall.pojo.ProductImage;
import mall.pojo.base.BasePOJO;

public class ProductExtension extends BasePOJO {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6161428408856542440L;

	@ManyToOne
    @JoinColumn(name = "cid")
    private Category category;

    @ManyToOne
    @JoinColumn(name="imgid")
    private ProductImage image;
    @OneToMany
    @JoinColumn(name="pid")
    private List<ProductImage> productImages;

    public ProductImage getImage() {
        return image;
    }

    public void setImage(ProductImage image) {
        this.image = image;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
