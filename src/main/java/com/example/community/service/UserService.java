package com.example.community.service;

import com.example.community.domain.User;
import com.example.community.mapper.UserMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private final UserMapper userMapper;

  public UserService(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  public List<User> getAllUsers() {
    return userMapper.getAllUsers();
  }

  public User getUserById(Long id) {
    return userMapper.getUserById(id);
  }

  // 유저 추가
  public void insertUser(User user) {
    userMapper.insertUser(user);
  }

  // 유저 수정
  public void updateUser(User user) {
    userMapper.updateUser(user);
  }

  // 유저 삭제
  public void deleteUser(Long id) {
    userMapper.deleteUser(id);
  }
}
