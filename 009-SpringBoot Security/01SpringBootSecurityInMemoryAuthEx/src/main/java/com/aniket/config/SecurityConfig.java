
package com.aniket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 1. Authentication (InMemory)

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails user = User.builder()
                .username("sam")
                .password(passwordEncoder().encode("sam"))
                .roles("ADMIN")
                .build();

        UserDetails user2 = User.builder()
                .username("ram")
                .password(passwordEncoder().encode("ram"))
                .roles("CUSTOMER")
                .build();

        return new InMemoryUserDetailsManager(user, user2);
    }

    // 2. Authorization

    @Bean
    public SecurityFilterChain configurePaths(HttpSecurity http)
            throws Exception {

        http.authorizeHttpRequests(
                request -> request
                    .requestMatchers("/", "/home").permitAll()
                    .anyRequest().authenticated()
                )
            .formLogin(form -> form
                    .loginPage("/login").permitAll())
            .logout(logout -> logout.permitAll());

        return http.build();
    }
}