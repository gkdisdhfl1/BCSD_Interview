package com.example.community.controller;

import com.example.community.domain.Board;
import com.example.community.service.BoardService;
import com.example.community.service.TopicService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
  private final TopicService topicService;
  private final BoardService boardService;

  @Autowired
  public HomeController(TopicService topicService, BoardService boardService) {
    this.topicService = topicService;
    this.boardService = boardService;
  }

  @GetMapping(value = {"", "/"})
  public String home(Model model) {
    model.addAttribute("topics", topicService.getAllTopics());
    return "home";
  }

  @GetMapping("/topics/{id}")
  public String topicDetail(@PathVariable Long id, Model model) {
    // 주제 ID를 이용하여 주제 정보를 가져옴
    List<Board> boardList = boardService.getAllBoardsByTopicId(id);

    if(boardList != null) {
      // 주제에 속하는 게시판 목록을 모델에 추가
      model.addAttribute("selectedTopic", boardList);
      return "selectedTopic";
    }

    // 주제가 없을 경우 홈 페이지로 리다이렉트
    return "redirect:/";
  }
}
