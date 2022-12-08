package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author hy
 * @email huangyao_a@163.com
 * @date 2022-12-05 14:38:25
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
    * @Description: 查出所有分类以及子类, 以树形结构组装起来
    * @Param: []
    * @Return java.util.List<com.atguigu.gulimall.product.entity.CategoryEntity>
    * @Author: Hy
    * @Date: 2022/12/8 7:30
    */
    List<CategoryEntity> listWithTree();
}

