package com.safecode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("com.safecode.dao")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//    @Bean
//    PageHelper pageHelper(){
//        //分页插件
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("reasonable", "true");
//        properties.setProperty("supportMethodsArguments", "true");
//        properties.setProperty("returnPageInfo", "check");
//        properties.setProperty("params", "count=countSql");
//        pageHelper.setProperties(properties);
//
//        //添加插件
//        new SqlSessionFactoryBean().setPlugins(new Interceptor[]{pageHelper});
//        return pageHelper;
//    }
}
