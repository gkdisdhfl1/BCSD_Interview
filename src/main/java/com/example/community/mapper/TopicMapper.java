package com.example.community.mapper;

import com.example.community.domain.Topic;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TopicMapper {
  List<Topic> getAllTopics();
  Topic getTopicById(int id);
  void insertTopic(Topic topic);
  void updateTopic(Topic topic);
  void deleteTopic(int id);
}
