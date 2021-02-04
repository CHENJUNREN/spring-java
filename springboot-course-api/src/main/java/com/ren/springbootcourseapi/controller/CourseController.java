package com.ren.springbootcourseapi.controller;

import com.ren.springbootcourseapi.pojo.Course;
import com.ren.springbootcourseapi.pojo.Topic;
import com.ren.springbootcourseapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics/{tid}")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getAllCoursesByTid(@PathVariable String tid) {
        return courseService.getAllCoursesByTid(tid);
    }

    @GetMapping("/courses/{cid}")
    public Course getCourse(@PathVariable String cid) {
        return courseService.getCourse(cid);
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String tid) {
        course.setTopic(new Topic(tid, "", ""));
        courseService.addCourse(course);
    }

    @PutMapping("/courses/{cid}")
    public void updateCourse(@PathVariable String cid, @RequestBody Course course, @PathVariable String tid) {
        course.setTopic(new Topic(tid, "", ""));
        courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{cid}")
    public void deleteCourse(@PathVariable String cid) {
        courseService.deleteCourse(cid);
    }
}
