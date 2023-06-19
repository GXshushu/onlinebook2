package com.example.onlinebook2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.onlinebook2.mapper")
public class Onlinebook2Application {

	public static void main(String[] args) {
		SpringApplication.run(Onlinebook2Application.class, args);
	}

}
