package cn.xm.supermarket.mapper;

import java.util.List;

import cn.xm.supermarket.entity.Classify;

public interface ClassifyMapper {
	/**
	 * 按分类查询商品
	 * @param 一级分类的id
	 * @return 所有一级分类
	 */
   List<Classify> findByParent(Integer parent);
   
}
