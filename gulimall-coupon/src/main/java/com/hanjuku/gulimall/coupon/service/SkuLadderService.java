package com.hanjuku.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanjuku.common.utils.PageUtils;
import com.hanjuku.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author yi.qin
 * @email 373455563@qq.com
 * @date 2022-03-11 14:20:54
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

