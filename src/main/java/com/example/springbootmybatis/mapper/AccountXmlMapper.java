package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AccountXmlMapper {

    public List<Account> findAll();
}
