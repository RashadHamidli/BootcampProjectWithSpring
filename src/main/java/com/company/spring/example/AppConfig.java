package com.company.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.company.spring.example")
public class AppConfig {
//    @Bean
//    public IMessage messageA() {
//        return new AMessage();
//    }
//    @Bean
//    public IMessage messageB() {
//        return new BMessage();
//    }
    // Bu sinifdə Spring komponentlərinin konfiqurasiyası təyin edilir
    // @ComponentScan ildə müəyyənləşdirilmiş bazaya uyğun komponentləri axtarır
}