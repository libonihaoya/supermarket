package cn.xm.supermarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.xm.supermarket.mapper")
public class SupermarketApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SupermarketApplication.class, args);
	}

}

