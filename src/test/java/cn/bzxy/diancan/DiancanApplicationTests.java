package cn.bzxy.diancan;

import cn.bzxy.diancan.pojo.ProductCategory;
import cn.bzxy.diancan.service.ProductCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("cn.bzxy.diancan.mapper")
public class DiancanApplicationTests {
    @Resource
    private ProductCategoryService productCategoryService;
    @Test
    public void contextLoads() {
        List<ProductCategory>list=productCategoryService.findProductCategoriesByShoppingId(1);
        for (ProductCategory c:list){
            System.out.println(c.toString());
        }
    }
    //   @Test
//   public void addCategory() {
//        System.out.println(productCategoryService.addProductCategory(new ProductCategory(4,"小吃",0,4,null,null,1)));
//   }

}
