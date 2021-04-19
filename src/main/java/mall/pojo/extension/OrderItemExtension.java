package mall.pojo.extension;

import mall.annotation.ORMAnnotation.JoinColumn;
import mall.annotation.ORMAnnotation.ManyToOne;
import mall.pojo.Comment;
import mall.pojo.Order;
import mall.pojo.Product;
import mall.pojo.base.BasePOJO;

public class OrderItemExtension extends BasePOJO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7991611221624210238L;
	@ManyToOne
    @JoinColumn(name="pid")
    private Product product;
    @ManyToOne
    @JoinColumn(name="oid")
    private Order order;
    @ManyToOne
    @JoinColumn(name="cmid")
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
