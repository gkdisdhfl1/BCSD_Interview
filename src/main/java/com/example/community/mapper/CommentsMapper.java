package com.example.community.mapper;

import com.example.community.domain.Comments;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentsMapper {
  List<Comments> getAllComments();
  Comments getCommentById(Long id);
  void insertComment(Comments comments);
  void updateComment(Comments comments);
  void deleteComment(Long id);
}
