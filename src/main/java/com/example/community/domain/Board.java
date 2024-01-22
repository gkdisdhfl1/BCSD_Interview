package com.example.community.domain;

import lombok.Data;

@Data
public class Board {
  private int id;
  private String title;
  private String content;
  private User user;
  private Topic topic;
}
