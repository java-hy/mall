package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 订单退货申请
 * 
 * @author hy
 * @email huangyao_a@163.com
 * @date 2022-12-05 10:50:07
 */
@MapperScan("com.atguigu.gulimall.order.dao")
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
