package com.example.community.mapper;

import com.example.community.domain.Comments;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentsMapper {
  List<Comments> getAllComments();
  Comments getComment(int id);
  void writeComment(Comments comments);
  void editComment(Comments comments);
  void deleteComment(int id);
}
