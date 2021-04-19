package mall.service.impl;


import org.springframework.stereotype.Service;

import mall.mapper.CategoryMapper;
import mall.pojo.CategoryExample;
import mall.service.CategoryService;

/**
 * @see CategoryService
 */
@Service
public class CategoryServiceImpl extends BaseServiceImpl<CategoryMapper,CategoryExample>
        implements CategoryService  {

}