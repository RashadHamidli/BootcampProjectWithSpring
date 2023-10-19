package com.company.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public IMessage messageA() {
        return new AMessage();
    }
    @Bean
    public IMessage messageB() {
        return new BMessage();
    }
}
