package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AccountMapper {

    @Select("select * from account")
    public List<Account> findAll();
}
