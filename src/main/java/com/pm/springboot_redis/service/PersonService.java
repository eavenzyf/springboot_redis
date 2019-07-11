package com.pm.springboot_redis.service;
import com.pm.springboot_redis.pojo.Person;

/**
 * @Classname PersonService
 * @Description TODO
 * @Date 2019/7/11 14:31
 * @Created by Eaven
 */
public interface PersonService {
    Person SelectByPrimaryKey(int id);
}
