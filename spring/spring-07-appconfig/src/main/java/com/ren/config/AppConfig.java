package com.ren.config;

import com.ren.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfig2.class)
@ComponentScan("com.ren.pojo")
public class AppConfig {

    @Bean
    public User user() {
        return new User();
    }
}
