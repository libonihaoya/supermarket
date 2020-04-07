package cn.xm.supermarket.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xm.supermarket.entity.Merchandise;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MerchandiseTest {
	@Autowired
	ClasifyMapper mapper;
	@Test
	public void findByCidMerchandise() {
		List<Merchandise> list= mapper.findByCidMerchandise(1);
		for (Merchandise merchandise : list) {
			System.err.println(merchandise);
		}
	}

}
