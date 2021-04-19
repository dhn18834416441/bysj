package mall.service.impl;

import org.springframework.stereotype.Service;

import mall.mapper.OrderItemMapper;
import mall.pojo.OrderItemExample;
import mall.service.OrderItemService;

@Service
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItemMapper,OrderItemExample>
        implements OrderItemService {
 
}