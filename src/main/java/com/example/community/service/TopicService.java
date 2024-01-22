package com.example.community.service;

import com.example.community.domain.Topic;
import com.example.community.mapper.TopicMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
  @Autowired
  private final TopicMapper topicMapper;

  public TopicService(TopicMapper topicMapper) {
    this.topicMapper = topicMapper;
  }

  public List<Topic> getAllTopics() {
    return topicMapper.getAllTopics();
  }

  public Topic getTopicById(int id) {
    return topicMapper.getTopicById(id);
  }

  // 주제 추가
  public void insertTopic(Topic topic) {
    topicMapper.insertTopic(topic);
  }

  // 주제 수정
  public void updateTopic(Topic topic) {
    topicMapper.updateTopic(topic);
  }

  // 주제 삭제
  public void deleteTopic(int id) {
    topicMapper.deleteTopic(id);
  }
}
