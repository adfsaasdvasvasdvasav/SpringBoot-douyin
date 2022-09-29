package com.example.springbootdouyin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//还可以启动，一些框架的配置

//如果启动一些高级项目，例如分布式，则用   @enable注解
@MapperScan("com.example.springbootdouyin.mapper") //myBatis的接口路径
@SpringBootApplication
public class SpringBootDouyinApplication {

    //启动方法
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDouyinApplication.class, args);
    }

}
