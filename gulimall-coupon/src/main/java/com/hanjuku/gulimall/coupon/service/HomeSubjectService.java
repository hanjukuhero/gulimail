package com.hanjuku.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanjuku.common.utils.PageUtils;
import com.hanjuku.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yi.qin
 * @email 373455563@qq.com
 * @date 2022-03-11 14:20:54
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

