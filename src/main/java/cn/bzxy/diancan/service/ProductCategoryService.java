package cn.bzxy.diancan.service;

import cn.bzxy.diancan.pojo.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    public List<ProductCategory> findProductCategoriesByShoppingId(Integer shopid);
    public boolean addProductCategory(ProductCategory pc);
    public boolean modifyProductCategory(ProductCategory pc);
    public ProductCategory findProductCategoryById(Integer categoryId);
    public List<ProductCategory> findProductCategoriesBypage(Integer pageIndex,Integer pageSize);
}
