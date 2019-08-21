package com.gy.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.gy.life.mapper")
public class LiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiftApplication.class, args);
    }

}