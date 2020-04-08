package cn.xm.supermarket.mapper;


import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xm.supermarket.entity.Merchandise;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MerchandiseMapperTests {
	
	@Autowired
	private MerchandiseMapper mapper;
	
	@Test
	public void insertOne() {
		Merchandise merchandise = new Merchandise();
		merchandise.setMname("hflsdf");
		merchandise.setAddTime(new Date());
		System.err.println(merchandise);
		Integer i = mapper.insertOne(merchandise);
		System.err.println(merchandise);
		
		System.err.println(i);
	}

	@Test
	public void updateNumByMid() {
		Integer mid = 5;
		Integer num = 11;
		String modifiedUser = "李波";
		Date modifiedTime = new Date();
		Integer i = mapper.updateNumByMid(mid,num,modifiedUser,modifiedTime);
		System.err.println(i);
	}
	
	@Test
	public void findByMname() {
		String mname = "李波";
		Merchandise merchandise = mapper.findByMname(mname);
		System.err.println(merchandise);
	}

}
