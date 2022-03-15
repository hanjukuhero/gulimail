package com.hanjuku.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 如果要远程调用别的服务需要如下条件：
 * 1、每个微服务引入open-feign依赖
 * <dependency>
 *   <groupId>org.springframework.cloud</groupId>
 *   <artifactId>spring-cloud-starter-openfeign</artifactId>
 *  </dependency>
 * 2、编写一个专用于调用远程服务的接口 com.hanjuku.gulimall.member.feign.CouponFeignService
 * 3、声明接口的方法具体是调用哪个服务哪个请求 com.hanjuku.gulimall.member.feign.CouponFeignService#memberCoupons()
 * 4、开启远程调用功能 @EnableFeignClients
 */

@EnableFeignClients(basePackages = "com.hanjuku.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
