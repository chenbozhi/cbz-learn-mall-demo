package com.cbz.learn.mall.part1.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 11272
 * @description: TODO
 * @date 2022/7/6 13:17
 **/
@Configuration
@MapperScan("com.cbz.learn.mall.part1.mapper")
public class MyBatisConfig {
}
