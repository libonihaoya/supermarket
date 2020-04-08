package cn.xm.supermarket.service;

import java.util.List;

import cn.xm.supermarket.entity.Classify;

public interface ClassifyService {
	 List<Classify> getByParent(Integer parent);
}
