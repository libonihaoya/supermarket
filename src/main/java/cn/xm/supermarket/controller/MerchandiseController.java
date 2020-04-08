package cn.xm.supermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xm.supermarket.entity.Merchandise;
import cn.xm.supermarket.service.MerchandiseService;
import cn.xm.supermarket.util.JsonResult;

@RestController
@RequestMapping("Merchandises")
public class MerchandiseController {
	
	@Autowired
	private MerchandiseService merchandiseService;
	
	private static final Integer OK = 2000;

	// http://localhost:8080/Merchandises/add?mname=旺仔&image=/user/image/shan.jsp&costPrice=10&price=20&num=10&datail=这是一个很棒的奶&cid=101&isPutaway=1
	@RequestMapping("add")
	public JsonResult<Void> addNew(Merchandise merchandise){
		merchandiseService.addNew(merchandise);
		//TODO 这里合并时需统一处理异常
		return new JsonResult<Void>(OK);
	}
}
