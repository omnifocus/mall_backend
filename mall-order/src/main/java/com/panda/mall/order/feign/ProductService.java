package com.panda.mall.order.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.panda.mall.commons.R;


@FeignClient(name = "mall-product")
public interface ProductService {

    @GetMapping("/product/brand/all")
    public R queryAllBrand() ;
}
