package cn.bzxy.diancan.service;

import cn.bzxy.diancan.mapper.ProductCategoryMapper;
import cn.bzxy.diancan.pojo.ProductCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("productCategoryService")
public class ProductCategoryServiceImp1 implements ProductCategoryService {
    @Resource
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public List<ProductCategory> findProductCategoriesByShoppingId(Integer shopid) {
        return productCategoryMapper.selectProductCategoriesByShoppingId(shopid);
    }

    @Override
    public boolean addProductCategory(ProductCategory pc) {
        Integer count=productCategoryMapper.insertProductCategory(pc);
        if(count==1)
        {
            return true;
        }else
        {
            return false;
        }
    }

    @Override
    public boolean modifyProductCategory(ProductCategory pc) {
        Integer count=productCategoryMapper.updateProductCategory(pc);
        if(count>=1)
        {
            return true;
        }else
        {
            return false;
        }
    }

    @Override
    public ProductCategory findProductCategoryById(Integer categoryId) {
        return productCategoryMapper.selectProductCategoryById(categoryId);
    }

    @Override
    public List<ProductCategory> findProductCategoriesBypage(Integer pageIndex, Integer pageSize) {
       return productCategoryMapper.selectProductCategoriesByPage(
                (pageIndex-1)*pageSize,pageSize);
    }
}
