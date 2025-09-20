package com.praneeth.demoApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppleConfig {

    @Bean
    @Scope("prototype")
    public Apple getApple() {
        return new Apple();
    }
}
