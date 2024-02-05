package com.example.community.controller;

import com.example.community.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  private final TopicService topicService;

  @Autowired
  public HomeController(TopicService topicService) {
    this.topicService = topicService;
  }

  @GetMapping(value = {"", "/"})
  public String home(Model model) {
    model.addAttribute("topics", topicService.getAllTopics());
    return "home";
  }


}
