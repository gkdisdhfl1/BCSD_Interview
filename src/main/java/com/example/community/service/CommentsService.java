package com.example.community.service;

import com.example.community.domain.Comments;
import com.example.community.mapper.CommentsMapper;
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

  public Comments getCommentsById(int id) {
    return commentsMapper.getComment(id);
  }

  // 댓글 추가
  public void insertComments(Comments comments) {
    commentsMapper.writeComment(comments);
  }

  // 댓글 수정
  public void updateComments(Comments comments) {
    commentsMapper.editComment(comments);
  }

  // 댓글 삭제
  public void deleteComments(int id) {
    commentsMapper.deleteComment(id);
  }
}
