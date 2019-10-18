package com.hex.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hex.boot.*.mapper")
public class mvcMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(mvcMybatisApplication.class,args);
    }
}
