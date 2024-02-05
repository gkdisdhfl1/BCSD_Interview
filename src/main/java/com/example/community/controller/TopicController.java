package com.example.community.controller;

import com.example.community.domain.Topic;
import com.example.community.service.BoardService;
import com.example.community.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topics")
public class TopicController {

  private final TopicService topicService;
  private final BoardService boardService;

  @Autowired
  public TopicController(TopicService topicService, BoardService boardService)  {
    this.topicService = topicService;
    this.boardService = boardService;
  }

  @PostMapping("/create")
  public void createTopic(@RequestBody Topic topic) {
    topicService.insertTopic(topic);
  }

  @GetMapping("/{id}")
  public Topic getTopicById(@PathVariable Long id) {
    return topicService.getTopicById(id);
  }


  @PutMapping("/update")
  public void updateTopic(@RequestBody Topic topic) {
    topicService.updateTopic(topic);
  }

  @DeleteMapping("/{id}")
  public void deleteTopic(@PathVariable Long id) {
    topicService.deleteTopic(id);
  }
}
