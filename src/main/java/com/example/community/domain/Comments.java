package com.example.community.domain;

import lombok.Data;

@Data
public class Comments {
  private int id;
  private String content;
  private User user;
  private Board board;
  private Comments parentComment;
}
