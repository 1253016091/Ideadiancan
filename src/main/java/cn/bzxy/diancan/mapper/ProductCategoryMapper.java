package cn.bzxy.diancan.mapper;

import cn.bzxy.diancan.pojo.ProductCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品分类访问数据接口
 */
public interface ProductCategoryMapper {
    /**
     * 根据给定的店铺编号获取当前店铺的所有分类信息
     * @param shopid 店铺编号
     * @return商品分类集合
     */
    public List<ProductCategory>selectProductCategoriesByShoppingId(@Param("shopid") Integer shopid);

    /**
     * 在商品中添加一条商品记录
     * @param pc 商品分类对象
     * @return 插入数据影响的行数
     */
    public Integer insertProductCategory(ProductCategory pc);

    /**
     * 在商品分类表中修改一条记录
     * @param pc 商品分类对象
     * @return 更新数据影响的的行数
     */
    public Integer updateProductCategory(ProductCategory pc);

//    /**
//     * 在商品分类表中
//     * @param pc 商品分类对象
//     * @return 更新数据影响的行数
//     */
//    public Integer deleteProductCategory(ProductCategory pc);

    /**
     *根据商品分类编号获取商品分类信息
     * @param categoryId 商品分类编号
     * @return 商品分类信息
     */
    public ProductCategory selectProductCategoryById(@Param("categoryId")Integer categoryId);

    /**
     * 分页显示商品分类信息
     * @param startPos 查询开始的位置
     * @param pageSize 页容量
     * @return 商品分类列表
     */
    public List<ProductCategory>selectProductCategoriesByPage(@Param("startPos")Integer startPos,@Param("pageSize")Integer pageSize);


}
