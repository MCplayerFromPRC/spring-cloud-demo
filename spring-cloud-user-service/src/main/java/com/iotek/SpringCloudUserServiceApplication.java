package com.iotek;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(value = "com.iotek.dao")
@EnableSwagger2
public class SpringCloudUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUserServiceApplication.class, args);
	}
}
