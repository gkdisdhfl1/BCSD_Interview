package com.example.community.service;

import com.example.community.domain.Comments;
import com.example.community.mapper.CommentsMapper;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

  @Autowired
  private final CommentsMapper commentsMapper;

  public CommentsService(CommentsMapper commentsMapper) {
    this.commentsMapper = commentsMapper;
  }

  public List<Comments> getAllComments() {
    return commentsMapper.getAllComments();
  }

  public Comments getCommentsById(Long id) {
    return commentsMapper.getCommentById(id);
  }

  // 댓글 추가
  public void insertComments(Comments comments) {
    commentsMapper.insertComment(comments);
  }

  // 댓글 수정
  public void updateComments(Long id, Long userId, String content) {
    Comments comments = commentsMapper.getCommentById(id);
    if(!comments.getUserId().equals(userId)) {
      return;
    }

    // 내용 수정
    comments.setContent(content);

    // 시간 갱신
    comments.setCreatedAt(new Timestamp(System.currentTimeMillis()));
    commentsMapper.updateComment(comments);
  }

  // 댓글 삭제
  public void deleteComments(Long id, Long userId) {
    Comments comments = commentsMapper.getCommentById(id);
    if(!comments.getUserId().equals(userId)) {
      return;
    }

    commentsMapper.deleteComment(id);
  }
}
