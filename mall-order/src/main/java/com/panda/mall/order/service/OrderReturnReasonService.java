package com.panda.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.panda.mall.commons.PageUtils;
import com.panda.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author panda
 * @email panda@gmail.com
 * @date 2025-08-18 14:09:29
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

