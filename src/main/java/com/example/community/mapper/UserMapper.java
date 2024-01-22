package com.example.community.mapper;

import com.example.community.domain.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  List<User> getAllUsers();
  User getUserById(int id);
  void insertUser(User user);
  void updateUser(User user);
  void deleteUser(int id);

}
