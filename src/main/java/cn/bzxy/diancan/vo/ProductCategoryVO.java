package cn.bzxy.diancan.vo;

public class ProductCategoryVO {
    private String msg;
    private String code;
    private ProductCategoryInnerVO data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProductCategoryInnerVO getData() {
        return data;
    }

    public void setData(ProductCategoryInnerVO data) {
        this.data = data;
    }
}
