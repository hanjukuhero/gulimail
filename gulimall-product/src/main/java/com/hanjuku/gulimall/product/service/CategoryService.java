package com.hanjuku.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanjuku.common.utils.PageUtils;
import com.hanjuku.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yi.qin
 * @email 373455563@qq.com
 * @date 2022-03-10 17:43:46
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

