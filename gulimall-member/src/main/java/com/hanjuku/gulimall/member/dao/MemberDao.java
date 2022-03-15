package com.hanjuku.gulimall.member.dao;

import com.hanjuku.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yi.qin
 * @email 373455563@qq.com
 * @date 2022-03-11 14:31:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
