package com.example.community.security;

import lombok.Data;

@Data
public class LoginRequest {
  private String username;
  private String password;
}
