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
	public List<Classify> getByParent(Integer parent) {
		List<Classify> result=mapper.findByParent(parent);
		for (Classify classify : result) {
			classify.setCid(null);
			classify.setCode(null);
		}
		return result;
	}

	


}
