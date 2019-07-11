package com.pm.springboot_redis.service.impl;
import com.pm.springboot_redis.dao.PersonMapper;
import com.pm.springboot_redis.pojo.Person;
import com.pm.springboot_redis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Classname PersonServiceImpl
 * @Description TODO
 * @Date 2019/7/11 14:30
 * @Created by Eaven
 */
@Service
@CacheConfig(cacheNames = "personCache")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    /**
     * 开启缓存
     * @param id
     * @return
     */
    @Override
    @Cacheable
    public Person SelectByPrimaryKey(int id) {
        return personMapper.selectById(id);
    }
}
