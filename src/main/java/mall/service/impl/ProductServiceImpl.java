package mall.service.impl;

import org.springframework.stereotype.Service;

import mall.mapper.ProductMapper;
import mall.pojo.ProductExample;
import mall.service.ProductService;

@Service
public class ProductServiceImpl extends BaseServiceImpl<ProductMapper,ProductExample> implements ProductService {

}