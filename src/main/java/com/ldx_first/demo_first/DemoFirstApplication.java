package com.ldx_first.demo_first;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.ldx_first.demo_first"})
@ComponentScan("com.ldx_first.demo_first")
public class DemoFirstApplication {
    /**
     * 系统就是从这起来的
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoFirstApplication.class, args);
    }
}

