package com.ashok.tip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ashok.tip.repository")
@EntityScan(basePackages = "com.ashok.tip.model")
public class TestIntelligencePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestIntelligencePlatformApplication.class, args);
    }
}