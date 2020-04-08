package cn.xm.supermarket.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xm.supermarket.entity.Merchandise;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MerchandiseServiceTests {
	
	@Autowired
	private MerchandiseService service;
	
	@Test
	public void insertOne() {
		Merchandise merchandise = new Merchandise();
		merchandise.setMname("小馒头");
		merchandise.setNum(7);
		merchandise.setIsPutaway(1);
		service.addNew(merchandise);
	}

}
