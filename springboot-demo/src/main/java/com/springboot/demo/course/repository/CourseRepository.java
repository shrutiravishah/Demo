package com.springboot.demo.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.course.bean.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
