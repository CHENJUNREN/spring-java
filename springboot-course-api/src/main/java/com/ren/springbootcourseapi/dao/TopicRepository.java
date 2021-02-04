package com.ren.springbootcourseapi.dao;

import com.ren.springbootcourseapi.pojo.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
