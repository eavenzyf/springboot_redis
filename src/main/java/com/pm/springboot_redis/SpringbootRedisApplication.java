package com.pm.springboot_redis;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@SpringBootApplication
@MapperScan("com.pm.springboot_redis.dao")
@EnableCaching
public class SpringbootRedisApplication {
    /**
     * 最终是使用mybatis generator maven插件生成的dao层
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisApplication.class, args);
    }

}
