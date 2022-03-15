package com.hanjuku.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanjuku.common.utils.PageUtils;
import com.hanjuku.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author yi.qin
 * @email 373455563@qq.com
 * @date 2022-03-11 14:20:54
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

