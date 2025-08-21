package com.panda.mall.product.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.panda.mall.commons.PageUtils;
import com.panda.mall.product.entity.CategoryEntity;

/**
 * 商品三级分类
 *
 * @author panda
 * @email thenextlei@gmail.com
 * @date 2025-08-17 21:03:42
 */
public interface CategoryService extends IService<CategoryEntity> {

	PageUtils queryPage(Map<String, Object> params);

	List<CategoryEntity> queryPageTree();
}
