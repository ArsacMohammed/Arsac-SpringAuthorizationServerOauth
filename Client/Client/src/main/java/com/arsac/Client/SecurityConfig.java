//package com.arsac.Client;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//public class SecurityConfig  {
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .anyRequest().authenticated() // Secure all requests
//                )
//                .oauth2Login(oauth2 -> oauth2
//                        .defaultSuccessUrl("/hello", true) // Redirect to /hello after successful login
//                );
//
//        return http.build();
//    }
//}
