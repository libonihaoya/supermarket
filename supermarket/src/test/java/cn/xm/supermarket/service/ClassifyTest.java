package cn.xm.supermarket.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xm.supermarket.entity.Classify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassifyTest {
	@Autowired
	ClassifyService service;
	@Test
	public void getByParent() {
		List<Classify> list= service.getBySort(11);
		for (Classify classify : list) {
			System.err.println(classify);
		}
	}
}
