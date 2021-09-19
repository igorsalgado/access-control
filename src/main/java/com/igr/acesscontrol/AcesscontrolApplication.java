package com.igr.acesscontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.igr.acesscontrol.model"})
public class AcesscontrolApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcesscontrolApplication.class, args);
    }

}
