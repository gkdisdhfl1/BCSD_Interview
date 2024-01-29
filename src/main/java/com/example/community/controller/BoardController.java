package com.example.community.controller;

import com.example.community.domain.Board;
import com.example.community.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
  public Board getBoardById(@PathVariable Long id) {
    return boardService.getBoardById(id);
  }

  @PostMapping("/update/{id}")
  public String updateBoard(@PathVariable Long id, Board board) {
    boardService.updateBoard(id, board.getUserId(), board.getTitle(), board.getContent());
    return "redirect:/";
  }

  @DeleteMapping("/delete/{id}")
  public void deleteBoard(@PathVariable Long id, Board board) {
    boardService.deleteBoard(id, board.getUserId());
  }
}
