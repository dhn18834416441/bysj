package mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mall.mapper.CommentMapper;
import mall.pojo.CommentExample;
import mall.pojo.Order;
import mall.pojo.OrderItem;
import mall.service.CommentService;
import mall.service.OrderItemService;
import mall.service.OrderService;

import java.util.List;

@Service
public class CommentServiceImpl extends BaseServiceImpl<CommentMapper,CommentExample>
        implements CommentService {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderItemService orderItemService;
    @Override
    public boolean checkFinishComment(Order order) {
        List<OrderItem> orderItems = order.getOrderItems();
        for(OrderItem orderItem:orderItems){
            if(orderItem.getComment()==null){
                return false;
            }
        }
        return true;
    }
}