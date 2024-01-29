package com.example.community.domain;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class Board {
  private Long id;
  private String title;
  private String content;
  private Long userId;
  private Timestamp createdAt;
  private Long topicId;
}
