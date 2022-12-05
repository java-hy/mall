package com.atguigu.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合mybatis-plus
 *      1) 导入依赖
 *      <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.4.2</version>
 *      </dependency>
 *      2) 配置
 *          配置数据源;
 *              导入数据库的驱动,所有微服务都要操作数据库,,直接将驱动写到 common中
 *              在application.yml配置数据源相关信息
 *          配置mybatis-plus相关信息;
 *              使用MapperScan
 *              告诉Mybatis-Plus, sql映射文件位置
 */
@MapperScan("com.atguigu.gulimall.order.dao")
@SpringBootApplication
public class GulimallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }

}
