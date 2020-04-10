package cn.xm.supermarket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xm.supermarket.entity.Classify;
import cn.xm.supermarket.mapper.ClassifyMapper;
import cn.xm.supermarket.service.ClassifyService;

@Service
public class ClassifyServicelmp implements ClassifyService {
	@Autowired
	private ClassifyMapper mapper;
	@Override
	public List<Classify> getBySort(Integer sort) {
		List<Classify> result=mapper.findBySort(sort);
		return result;
	}

	


}
