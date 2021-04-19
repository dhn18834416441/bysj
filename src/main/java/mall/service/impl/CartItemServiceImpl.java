package mall.service.impl;

import org.springframework.stereotype.Service;

import mall.mapper.CartItemMapper;
import mall.pojo.CartItemExample;
import mall.service.CartItemService;

@Service
public class CartItemServiceImpl extends BaseServiceImpl<CartItemMapper,CartItemExample>
        implements CartItemService {
 
}