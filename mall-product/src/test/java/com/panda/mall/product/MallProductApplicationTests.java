package com.panda.mall.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.panda.mall.product.entity.BrandEntity;
import com.panda.mall.product.service.BrandService;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    public BrandService brandService;

    @Test
    void testBrand() {
    	BrandEntity brandEntity = new BrandEntity();
    	brandEntity.setDescript("demo brand");
    	brandEntity.setFirstLetter("D");
    	brandEntity.setLogo("demo");
    	brandEntity.setName("Demo");
    	brandEntity.setShowStatus(0);
        brandService.save(brandEntity);
         
    }

	@Test
	void contextLoads() {
	}
	
	@Test
	void testSelect() {
		List<BrandEntity> list =  brandService.list();
		System.out.print(list);
	}

	@Test
	void testSelectById() {
//		List<BrandEntity> list =  brandService.listByIds(List.of(1));
//		System.out.print(list);
		
		BrandEntity entity = brandService.getOne(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
		System.err.println(entity);
	}
}
