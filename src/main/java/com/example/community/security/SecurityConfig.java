package com.example.community.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//  private final UserDetailsService userDetailsService;
//  private final JwtTokenProvider jwtTokenProvider;
//
//  @Autowired
//  public SecurityConfig(UserDetailsService userDetailsService, JwtTokenProvider jwtTokenProvider) {
//    this.userDetailsService = userDetailsService;
//    this.jwtTokenProvider = jwtTokenProvider;
//  }
//
//  @Bean
//  public PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }
//
//  @Override
//  @Bean
//  public AuthenticationManager authenticationManagerBean() throws Exception {
//    return super.authenticationManagerBean();
//  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http.csrf().disable()
//        .authorizeRequests()
//        .antMatchers("/api/auth/**").permitAll() // 로그인 및 회원가입 엔드포인트
//        .anyRequest().authenticated()
//        .and()
//        .addFilterBefore(new JwtTokenFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class);
//  }
//}
