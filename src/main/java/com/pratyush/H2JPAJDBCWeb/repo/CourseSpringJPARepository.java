package com.pratyush.H2JPAJDBCWeb.repo;

import com.pratyush.H2JPAJDBCWeb.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringJPARepository extends JpaRepository<Course,Long> {
    List<Course> findByAuthor(String author);
}
