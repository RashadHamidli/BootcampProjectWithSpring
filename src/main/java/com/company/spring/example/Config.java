package com.company.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Message message() {
        Message message = new Message();
        message.setMessage("Hello world");
        return message;
    }
}
