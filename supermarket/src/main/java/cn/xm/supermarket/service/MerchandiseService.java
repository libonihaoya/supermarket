package cn.xm.supermarket.service;

import java.util.List;

import cn.xm.supermarket.entity.Merchandise;

public interface MerchandiseService {
	List<Merchandise> findByCidMerchandise(Integer cid);
}
