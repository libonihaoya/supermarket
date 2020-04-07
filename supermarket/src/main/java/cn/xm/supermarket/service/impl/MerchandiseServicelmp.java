package cn.xm.supermarket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xm.supermarket.entity.Merchandise;
import cn.xm.supermarket.mapper.ClasifyMapper;
import cn.xm.supermarket.service.MerchandiseService;

@Service
public class MerchandiseServicelmp implements MerchandiseService {
     @Autowired
     private ClasifyMapper mapper;
	@Override
	public List<Merchandise> findByCidMerchandise(Integer cid) {
		List<Merchandise> data= getByCidMerchandise(cid);
		for (Merchandise merchandise : data) {
			merchandise.setDatail(null);
			merchandise.setIsPutaway(null);
			merchandise.setCreatedTime(null);
			merchandise.setCreatedUser(null);
			merchandise.setModifiedTime(null);
			merchandise.setModifiedUser(null);
			merchandise.setAddTime(null);
			merchandise.setLunchTime(null);
			merchandise.setSoldoutTime(null);
		}
		return data;
	}
	/**
	 * 按分类查询商品
	 * @param cid 
	 * @return 该类的所有商品
	 */
   List<Merchandise> getByCidMerchandise(Integer cid){
	   return mapper.findByCidMerchandise(cid);
   }

}
