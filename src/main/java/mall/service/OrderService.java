package mall.service;

import java.util.List;

import mall.pojo.CartItem;
import mall.pojo.Order;
import mall.service.BaseService;

public interface OrderService extends BaseService{
    /**
     * 添加订单
     */
    public void createOrder(Order order ,List<CartItem> cartItems) throws Exception;
}