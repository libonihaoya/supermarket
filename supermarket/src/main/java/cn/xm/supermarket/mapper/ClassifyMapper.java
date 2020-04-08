package cn.xm.supermarket.mapper;

import java.util.List;

import cn.xm.supermarket.entity.Classify;

public interface ClassifyMapper {
	/**
	 * 按分类查询
	 * @param sort 一级/二级分类的id
	 * @return 该分类的所有类别
	 */
   List<Classify> findBySort(Integer sort);
}
