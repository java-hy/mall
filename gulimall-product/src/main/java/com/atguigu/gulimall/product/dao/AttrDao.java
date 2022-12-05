package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author hy
 * @email huangyao_a@163.com
 * @date 2022-12-05 14:38:25
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
