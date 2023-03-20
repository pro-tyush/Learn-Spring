package com.pratyush.H2JPAJDBCWeb.repo;

import com.pratyush.H2JPAJDBCWeb.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJPARepository extends JpaRepository<Course,Long> {
}
