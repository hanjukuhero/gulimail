package com.hanjuku.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanjuku.common.utils.PageUtils;
import com.hanjuku.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yi.qin
 * @email 373455563@qq.com
 * @date 2022-03-10 17:43:46
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

