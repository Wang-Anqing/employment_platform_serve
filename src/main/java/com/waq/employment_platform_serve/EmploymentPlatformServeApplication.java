package com.waq.employment_platform_serve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.waq.employment_platform_serve.mapper")
public class EmploymentPlatformServeApplication {


    public static void main(String[] args) {
        SpringApplication.run(EmploymentPlatformServeApplication.class, args);
    }

}
