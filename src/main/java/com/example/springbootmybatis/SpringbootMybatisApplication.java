package com.example.springbootmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootMybatisApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootMybatisApplication.class, args);

		System.out.println("hello 132");
		System.out.println("hello 为啥会有感叹号啊");
		System.out.println("hello 你说是吧");
	}

}
