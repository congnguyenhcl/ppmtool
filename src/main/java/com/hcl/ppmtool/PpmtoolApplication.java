package com.hcl.ppmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class PpmtoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpmtoolApplication.class, args);
    }

}
