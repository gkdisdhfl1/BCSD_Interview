//package com.example.community.service;
//
//import com.example.community.domain.User;
//import com.example.community.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailServiceImpl implements UserDetailsService {
//  private final UserMapper userMapper;
//
//  @Autowired
//  public UserDetailServiceImpl(UserMapper userMapper) {
//    this.userMapper = userMapper;
//  }
//
//  @Override
//  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//    User user = userMapper.findByUsername(username);
//
//    return org.springframework.security.core.userdetails.User
//        .withUsername(user.getUsername())
//        .password(user.getPassword())
//        .roles("USER") // 사용자의 권한을 설정
//        .build();
//  }
//}
