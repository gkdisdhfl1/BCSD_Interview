package com.example.community.mapper;

import com.example.community.domain.Board;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
  List<Board> getAllBoards();
  Board getBoardById(Long id);
  void insertBoard(Board board);
  void updateBoard(Board board);
  void deleteBoard(Long id);
  List<Board> getAllBoardsByTopicId(Long topicId);
}
