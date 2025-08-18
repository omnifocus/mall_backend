package com.panda.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.panda.mall.commons.PageUtils;
import com.panda.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author panda
 * @email thenextlei@gmail.com
 * @date 2025-08-17 21:03:43
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

