package com.example.community.controller;

import com.example.community.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  private final TopicService topicService;

  @Autowired
  public HomeController(TopicService topicService) {
    this.topicService = topicService;
  }

  @GetMapping(value = {"", "/"})
  public String topichome(Model model) {
    model.addAttribute("topics", topicService.getAllTopics());
    return "home";
  }
}
