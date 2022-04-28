package com.pl.grainmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.整合mybatis-plus
 *      1) 整合依赖
 *      2)  配置
 *            1 配置数据源;
 *                  1) 导入数据库的驱动
 *                  2)  在application.yml配置数据源相关信息
 *            2 配置mybatis-plus:
 *                  1)  使用@MapperScan
 *                  2)  告诉Mybatis-plus  sql映射文件的位置
 */
@MapperScan("com.pl.grainmall.product.dao")
@SpringBootApplication
public class GrainmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainmallProductApplication.class, args);
    }

}
