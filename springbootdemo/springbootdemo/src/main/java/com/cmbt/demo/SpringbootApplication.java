package com.cmbt.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//此注解表示动态扫描DAO接口所在包
@MapperScan("com.cmbt.demo.mapper")
//此注解表示SpringBoot启动类
@SpringBootApplication
public class SpringbootApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
    public static void main(String[] args) {
        logger.info("=================开始成功=================");
        SpringApplication.run(SpringbootApplication.class, args);
        logger.info("=================启动成功=================");
    }
}