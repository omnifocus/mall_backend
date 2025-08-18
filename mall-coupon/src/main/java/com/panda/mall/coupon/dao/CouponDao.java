package com.panda.mall.coupon.dao;

import com.panda.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author panda
 * @email panda@gmail.com
 * @date 2025-08-18 14:12:29
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
