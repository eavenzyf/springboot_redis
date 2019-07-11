package com.pm.springboot_redis.dao;

import com.pm.springboot_redis.pojo.Person;

public interface PersonMapper {
    int insert(Person record);

    int insertSelective(Person record);

    Person selectById(int id);
}