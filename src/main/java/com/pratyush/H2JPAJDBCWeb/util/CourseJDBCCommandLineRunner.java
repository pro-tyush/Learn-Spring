package com.pratyush.H2JPAJDBCWeb.util;

import com.pratyush.H2JPAJDBCWeb.model.Course;
import com.pratyush.H2JPAJDBCWeb.repo.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS","Amazon Inc"));
        repository.insert(new Course(2,"Learn GCS","Google Inc"));
        //repository.deleteById(1);
        System.out.println(repository.findById(1));

    }
}
