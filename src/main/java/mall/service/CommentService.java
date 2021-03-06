package mall.service;

import mall.pojo.Order;

public interface CommentService extends BaseService{
    /**
     *
     * @param order 待检测的 order
     * @return 如果已评论完该订单下的所有商品，则返回true，否则返回false
     */
    public boolean checkFinishComment(Order order);
}