package com.insightveda.spring_boot_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/users/**").permitAll() // Allow access to all user-related endpoints
                        .requestMatchers("/api/orders/**").denyAll() // Block access to all order-related endpoints
                        .anyRequest().authenticated()               // Require authentication for any other endpoints
                )
                .httpBasic(); // Use basic authentication for simplicity

        return http.build();
    }
}
