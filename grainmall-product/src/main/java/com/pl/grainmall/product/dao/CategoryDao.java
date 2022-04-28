package com.pl.grainmall.product.dao;

import com.pl.grainmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 19:31:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
