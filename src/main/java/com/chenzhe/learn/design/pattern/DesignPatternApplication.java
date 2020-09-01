package com.chenzhe.learn.design.pattern;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cz
 */
@SpringBootApplication
@MapperScan("com.chenzhe.learn.design.pattern.**.dao")
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }

}
