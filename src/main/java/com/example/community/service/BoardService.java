package com.example.community.service;

import com.example.community.domain.Board;
import com.example.community.mapper.BoardMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
  @Autowired
  private final BoardMapper boardMapper;

  public BoardService(BoardMapper boardMapper) {
    this.boardMapper = boardMapper;
  }

  public List<Board> getAllBoards() {
    return boardMapper.getAllBoards();
  }

  public Board getBoardById(int id) {
    return boardMapper.getBoardById(id);
  }

  // 게시글 추가
  public void insertBoard(Board board) {
    boardMapper.writeBoard(board);
  }

  // 게시글 수정
  public void updateBoard(Board board) {
    boardMapper.editBoard(board);
  }

  // 게시글 삭제
  public void deleteBoard(int id) {
    boardMapper.deleteBoard(id);
  }

}
