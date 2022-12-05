package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hy
 * @email huangyao_a@163.com
 * @date 2022-12-05 10:50:07
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
