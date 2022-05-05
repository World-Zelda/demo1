package com.example.springbootmybatis;

import com.example.springbootmybatis.domain.Account;
import com.example.springbootmybatis.mapper.AccountMapper;
import com.example.springbootmybatis.mapper.AccountXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;
import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {
	@Autowired
	AccountMapper accountMapper;
	@Autowired
	AccountXmlMapper accountXmlMapper;
	@Test
	void contextLoads() {
		List<Account> list = accountMapper.findAll();
		Iterator<Account> iterator = list.iterator();
		while (iterator.hasNext()){
			Account account = iterator.next();
			System.out.println(account);
		}
	}
	@Test
	void contextLoad() {
		List<Account> list = accountXmlMapper.findAll();
		Iterator<Account> iterator = list.iterator();
		while (iterator.hasNext()){
			Account account = iterator.next();
			System.out.println(account);
		}
	}
}
