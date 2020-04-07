package cn.xm.supermarket.mapper;

import java.util.List;

import cn.xm.supermarket.entity.Classify;

public interface ClassifyMapper {
	/**
	 * 按分类查询商品
	 * @param 
	 * @return 该类的所有商品
	 */
   List<Classify> findByParent(Integer parent);
}
