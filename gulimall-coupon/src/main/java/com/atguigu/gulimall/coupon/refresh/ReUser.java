package com.atguigu.gulimall.coupon.refresh;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * @description: nacos_动态刷新
 * @ClassName: ReUser
 * @author: Hy
 * @create: 2022-12-05 22:00
 * @Version: 1.0
 **/
@Configuration
@RefreshScope
@Data
public class ReUser implements Serializable {
    private static final long serialVersionUID = -4382894838674070164L;
    @Value("${coupon.user.name}")
    private String name;

    @Value("${coupon.user.age}")
    private Integer age;

}
