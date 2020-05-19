package com.databasecourse.applysys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.databasecourse.applysys.Dao")
public class ApplysysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplysysApplication.class, args);
    }

}
