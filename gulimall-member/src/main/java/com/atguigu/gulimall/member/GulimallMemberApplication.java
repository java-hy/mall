package com.atguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.想要远程调用别的服务
 *  引入 open-feign
 *  编写一个接口,告诉SpringCloud这个接口需要远程调用
 *      声明接口的每一个方法都是调用那个远程服务 的那个请求
 *  开启远程调用功能
 */

@MapperScan("com.atguigu.gulimall.member.dao")
@EnableFeignClients(basePackages = {"com.atguigu.gulimall.member.feign"})
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
