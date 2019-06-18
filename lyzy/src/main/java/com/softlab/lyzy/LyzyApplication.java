package com.softlab.lyzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.softlab.lyzy.core.mapper")
public class LyzyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyzyApplication.class, args);
    }

}
