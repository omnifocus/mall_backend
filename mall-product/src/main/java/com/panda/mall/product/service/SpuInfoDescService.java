package com.panda.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.panda.mall.commons.PageUtils;
import com.panda.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author panda
 * @email thenextlei@gmail.com
 * @date 2025-08-17 21:03:43
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

