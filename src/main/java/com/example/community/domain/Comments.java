package com.example.community.domain;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class Comments {
  private Long id;
  private String content;
  private Long userId;
  private Long boardId;
  private Long parentCommentId;
  private Timestamp createdAt;
}
