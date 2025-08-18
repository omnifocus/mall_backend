package com.panda.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.panda.mall.commons.PageUtils;
import com.panda.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author panda
 * @email thenextlei@gmail.com
 * @date 2025-08-17 21:03:43
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

