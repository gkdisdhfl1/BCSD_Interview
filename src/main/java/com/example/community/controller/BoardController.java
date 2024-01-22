package com.example.community.controller;

import com.example.community.domain.Board;
import com.example.community.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
public class BoardController {

  private final BoardService boardService;

  @Autowired
  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }

  @PostMapping("/create")
  public void createBoard(@RequestBody Board board) {
    boardService.insertBoard(board);
  }

  @GetMapping("/{id}")
  public Board getBoardById(@PathVariable int id) {
    return boardService.getBoardById(id);
  }

  @PutMapping("/update")
  public void updateBoard(@RequestBody Board board) {
    boardService.updateBoard(board);
  }

  @DeleteMapping("/{id}")
  public void deleteBoard(@PathVariable int id) {
    boardService.deleteBoard(id);
  }
}
