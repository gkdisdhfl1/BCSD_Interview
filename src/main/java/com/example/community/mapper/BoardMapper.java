package com.example.community.mapper;

import com.example.community.domain.Board;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
  List<Board> getAllBoards();
  Board getBoardById(int id);
  void writeBoard(Board board);
  void editBoard(Board board);
  void deleteBoard(int id);
}
