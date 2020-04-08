package cn.xm.supermarket.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xm.supermarket.entity.Merchandise;
import cn.xm.supermarket.mapper.MerchandiseMapper;
import cn.xm.supermarket.service.MerchandiseService;
import cn.xm.supermarket.service.ex.InsertException;
import cn.xm.supermarket.service.ex.UpdateException;

/**
 * 商品业务层实现类
 * @author asus
 *
 */
@Service
public class MerchandiseServicelmp implements MerchandiseService {
	
	@Autowired
	private MerchandiseMapper merchandiseMapper;

	@Override
	public void addNew(Merchandise merchandise) {
		//获取现在的时间
		Date date = new Date();
		//TODO 从session中取出username
		String username = "test";
		//使用填写的商品名称与查找数据
		String mname = merchandise.getMname();
		Merchandise result = merchandiseMapper.findByMname(mname);
		//判断是否含有相同名字的商品
		if (result != null) {
			//--如果有的话在原有商品上修改数量并补全数据modifiedUser,modifiedTime即可
			//--从结果中取出id,num
			Integer mid = result.getMid();
			Integer num = result.getNum()+merchandise.getNum();
			String modifiedUser = username;
			Date modifiedTime = date;
			//--根据id修改num
			Integer i = merchandiseMapper.updateNumByMid(mid, num, modifiedUser, modifiedTime);
			if (i != 1) {
				throw new UpdateException("添加商品时发生未知错误(库里已有该商品，正尝试修改库存)，请联系网站管理员");
			}
			return;
		}
		//没有则补全数据，addTime,(launchTime/soldoutTime),创建的两个日志
		merchandise.setAddTime(date);
		merchandise.setCreatedUser("username");
		merchandise.setCreatedTime(date);
		if (merchandise.getIsPutaway() == 1) {
			merchandise.setLaunchTime(date);
		}else {
			merchandise.setSoldoutTime(date);
		}
		//否则调用持久层的insertOne进行添加
		System.err.println(merchandise);
		Integer i = merchandiseMapper.insertOne(merchandise);
		//判断插入数据时是否发生异常
		if (i != 1) {
			//--是，则抛出异常InsertException();
			throw new InsertException("添加商品时发生未知错误，请联系网站管理员");
		}
		
	}
	


}
