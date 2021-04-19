package mall.mapper;

import java.util.List;

import mall.pojo.ProductImage;
import mall.pojo.ProductImageExample;

public interface ProductImageMapper extends BaseMapper<ProductImage, ProductImageExample> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated
     */
    int insert(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated
     */
    int insertSelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated
     */
    List<ProductImage> selectByExample(ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated
     */
    ProductImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProductImage record);
}