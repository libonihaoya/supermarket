package cn.xm.supermarket.mapper;

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
	ClassifyMapper mapper;
	@Test
	public void findBySort() {
		List<Classify> list= mapper.findBySort(11);
		for (Classify c : list) {
			System.err.println(c);
		}
	}	

}
