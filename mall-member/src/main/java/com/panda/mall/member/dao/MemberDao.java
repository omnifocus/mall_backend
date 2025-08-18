package com.panda.mall.member.dao;

import com.panda.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author panda
 * @email panda@gmail.com
 * @date 2025-08-18 14:14:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
