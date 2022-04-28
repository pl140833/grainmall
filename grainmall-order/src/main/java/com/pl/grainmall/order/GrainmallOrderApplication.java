package com.pl.grainmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pl.grainmall.order.dao")
@SpringBootApplication
public class GrainmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainmallOrderApplication.class, args);
    }

}
