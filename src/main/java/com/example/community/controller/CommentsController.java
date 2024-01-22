package com.example.community.controller;

import com.example.community.domain.Comments;
import com.example.community.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentsController {

  private final CommentsService commentsService;

  @Autowired
  public CommentsController(CommentsService commentsService) {
    this.commentsService = commentsService;
  }

  @PostMapping("/create")
  public void createComments(@RequestBody Comments comments) {
    commentsService.insertComments(comments);
  }

  @GetMapping("/{id}")
  public Comments getCommentsById(@PathVariable int id) {
    return commentsService.getCommentsById(id);
  }

  @PutMapping("/update")
  public void updateComments(@RequestBody Comments comments) {
    commentsService.updateComments(comments);
  }

  @DeleteMapping("/{id}")
  public void deleteComments(@PathVariable int id) {
    commentsService.deleteComments(id);
  }
}
