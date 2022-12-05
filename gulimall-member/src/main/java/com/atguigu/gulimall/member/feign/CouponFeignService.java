package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 远程调用Coupon接口
 * @ClassName: CouponFeignService
 * @author: hy
 * @create: 2022-12-05 17:23
 * @Version: 1.0
 */

/**
 * 这是一个声明式远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    //todo: 下面最开始的 /去掉和不去 有什么区别
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();

}
