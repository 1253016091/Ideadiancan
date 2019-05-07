package cn.bzxy.diancan.vo;

import cn.bzxy.diancan.pojo.ProductCategory;

import java.util.List;

public class ProductCategoryInnerVO {
    private String a;
    private String b;
    private List<ProductCategory> categories;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ProductCategory> categories) {
        this.categories = categories;
    }
}
