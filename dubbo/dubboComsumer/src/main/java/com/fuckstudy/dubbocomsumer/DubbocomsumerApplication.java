package com.fuckstudy.dubbocomsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class DubbocomsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubbocomsumerApplication.class, args);
    }

}
