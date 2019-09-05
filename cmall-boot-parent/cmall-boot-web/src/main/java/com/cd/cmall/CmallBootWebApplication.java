package com.cd.cmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.cd.cmall.mapper.sys"})
public class CmallBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmallBootWebApplication.class, args);
    }

}
