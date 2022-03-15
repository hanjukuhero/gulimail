package com.hanjuku.gulimall.order.dao;

import com.hanjuku.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yi.qin
 * @email 373455563@qq.com
 * @date 2022-03-11 14:39:54
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
