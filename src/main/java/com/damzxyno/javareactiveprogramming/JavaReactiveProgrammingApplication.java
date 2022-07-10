package com.damzxyno.javareactiveprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class JavaReactiveProgrammingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaReactiveProgrammingApplication.class, args);
    }

}
