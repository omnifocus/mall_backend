package com.panda.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.panda.mall.commons.PageUtils;
import com.panda.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author panda
 * @email panda@gmail.com
 * @date 2025-08-18 14:09:29
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

