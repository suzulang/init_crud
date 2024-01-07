package com.jiang.suzulangblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 扫描 Mapper 接口，这里需要改成你自己的包名
@MapperScan("com.jiang.suzulangblog.mapper")
public class SuzulangBlogBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuzulangBlogBackendApplication.class, args);
    }

}
