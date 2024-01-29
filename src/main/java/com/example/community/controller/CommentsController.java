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
  public Comments getCommentsById(@PathVariable Long id) {
    return commentsService.getCommentsById(id);
  }

  @PostMapping("/update/{id}")
  public void updateComments(@PathVariable Long id, Comments comments) {
    commentsService.updateComments(id, comments.getUserId(), comments.getContent());
  }

  @DeleteMapping("/delete/{id}")
  public void deleteComments(@PathVariable Long id, Comments comments) {
    commentsService.deleteComments(id, comments.getUserId());
  }
}
