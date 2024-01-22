package com.example.community.controller;

import com.example.community.domain.Topic;
import com.example.community.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topics")
public class TopicController {

  private final TopicService topicService;

  @Autowired
  public TopicController(TopicService topicService)  {
    this.topicService = topicService;
  }

  @PostMapping("/create")
  public void createTopic(@RequestBody Topic topic) {
    topicService.insertTopic(topic);
  }

  @GetMapping("/{id}")
  public Topic getTopicById(@PathVariable int id) {
    return topicService.getTopicById(id);
  }

  @PutMapping("/update")
  public void updateTopic(@RequestBody Topic topic) {
    topicService.updateTopic(topic);
  }

  @DeleteMapping("/{id}")
  public void deleteTopic(@PathVariable int id) {
    topicService.deleteTopic(id);
  }
}
