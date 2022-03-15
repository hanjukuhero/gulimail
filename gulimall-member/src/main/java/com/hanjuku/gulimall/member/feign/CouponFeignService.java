package com.hanjuku.gulimall.member.feign;

import com.hanjuku.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author：yi.qin
 * @date：2022/3/15
 * @version：1.0
 * @slogan：打铁还需自身硬
 */

/**
 * 声明式远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
