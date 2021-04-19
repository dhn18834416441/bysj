package mall.service.impl;


import org.springframework.stereotype.Service;

import mall.mapper.ProductImageMapper;
import mall.pojo.ProductImageExample;
import mall.service.ProductImageService;

@Service
public class ProductImageServiceImpl extends BaseServiceImpl<ProductImageMapper,ProductImageExample>
        implements ProductImageService {

}