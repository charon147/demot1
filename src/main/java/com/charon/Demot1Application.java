package com.charon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value= {"classpath:spring-web.xml"})//读取配置文件
@SpringBootApplication
public class Demot1Application extends SpringBootServletInitializer {

    public  static void main(String[] args) {
        SpringApplication.run(Demot1Application.class, args);
    }

}
