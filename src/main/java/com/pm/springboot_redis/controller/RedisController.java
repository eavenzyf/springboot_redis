package com.pm.springboot_redis.controller;
import com.pm.springboot_redis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname RedisController
 * @Description TODO
 * @Date 2019/7/11 11:41
 * @Created by Eaven
 */
@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private PersonService personService;
    @GetMapping("redis")
    public String redis(){
        stringRedisTemplate.opsForValue().set("first","helloWorld");
        return stringRedisTemplate.opsForValue().get("first");
    }
}
