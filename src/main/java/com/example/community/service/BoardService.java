package com.example.community.service;

import com.example.community.domain.Board;
import com.example.community.mapper.BoardMapper;
import java.sql.Timestamp;
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

  public Board getBoardById(Long id) {
    return boardMapper.getBoardById(id);
  }

  // 게시글 추가
  public void insertBoard(Board board) {
    boardMapper.insertBoard(board);
  }

  // 게시글 수정
  public void updateBoard(Long id, Long userId, String title, String content) {
    Board board = boardMapper.getBoardById(id);
    if(!board.getUserId().equals(userId)) {
      return;
    }

    // 내용 수정
    board.setTitle(title);
    board.setContent(content);

    // 시간 갱신
    board.setCreatedAt(new Timestamp(System.currentTimeMillis()));
    boardMapper.updateBoard(board);
  }

  // 게시글 삭제
  public void deleteBoard(Long id, Long userId) {
    Board board = boardMapper.getBoardById(id);
    if(!board.getUserId().equals(userId)) {
      return;
    }

    boardMapper.deleteBoard(id);
  }

  public List<Board> getAllBoardsByTopicId(Long topicId) {
    return boardMapper.getAllBoardsByTopicId(topicId);
  }

}
