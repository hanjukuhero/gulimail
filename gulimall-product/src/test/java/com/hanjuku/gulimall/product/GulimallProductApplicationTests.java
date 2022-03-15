package com.hanjuku.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hanjuku.gulimall.product.entity.BrandEntity;
import com.hanjuku.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    void add() {
        BrandEntity entity = new BrandEntity();
        entity.setName("华为");
        brandService.save(entity);
        System.out.println("保存成功...");
    }

    @Test
    void modify() {
        BrandEntity entity = new BrandEntity();
        entity.setBrandId(1L);
        entity.setDescript("华为手机好");
        brandService.updateById(entity);
    }

    @Test
    void queryList() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach(System.out::println);
    }

}
