package com.jiang.suzulangblogbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiang.suzulangblogbackend.mapper")
public class SuzulangBlogBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuzulangBlogBackendApplication.class, args);
    }

}
