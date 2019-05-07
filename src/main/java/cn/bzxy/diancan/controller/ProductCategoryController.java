package cn.bzxy.diancan.controller;

import cn.bzxy.diancan.pojo.ProductCategory;
import cn.bzxy.diancan.service.ProductCategoryService;
import cn.bzxy.diancan.vo.ProductCategoryInnerVO;
import cn.bzxy.diancan.vo.ProductCategoryVO;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/cate")
public class ProductCategoryController {
    @Resource
    private ProductCategoryService productCategoryService;

    @ResponseBody
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public String getAllCategoryByShoppingId(@RequestParam("shopid")Integer shopid){
        List<ProductCategory> list=productCategoryService.findProductCategoriesByShoppingId(shopid);
        ProductCategoryInnerVO ivo=new ProductCategoryInnerVO();
        ivo.setA("课工场");
        ivo.setB("北京大学城校区");
        ivo.setCategories(list);
        ProductCategoryVO vo=new ProductCategoryVO();
        vo.setMsg("武大郎烧饼");
        vo.setCode("100000");
        vo.setData(ivo);
        return JSON.toJSONString(vo);
    }

}
