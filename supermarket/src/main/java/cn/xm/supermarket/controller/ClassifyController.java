package cn.xm.supermarket.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xm.supermarket.entity.Classify;
import cn.xm.supermarket.service.ClassifyService;
import cn.xm.supermarket.util.JsonResult;

@RestController
public class ClassifyController extends BaseController {
	@Autowired
	private ClassifyService service;
	//http://localhost:8080/classifys?sort=10
	@RequestMapping("classifys")
	public JsonResult<List<Classify>> findBySort(Integer sort){
	   List<Classify> data=	service.getBySort(sort);
		return new JsonResult<List<Classify>>(2000, data);	
	}
	

}
