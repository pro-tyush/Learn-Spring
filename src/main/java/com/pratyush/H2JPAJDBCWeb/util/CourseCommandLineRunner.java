package com.pratyush.H2JPAJDBCWeb.util;

import com.pratyush.H2JPAJDBCWeb.model.Course;
import com.pratyush.H2JPAJDBCWeb.repo.CourseJPARepository;
import com.pratyush.H2JPAJDBCWeb.repo.CourseSpringJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJPARepository repository;

    @Autowired
    private CourseSpringJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS", "Amazon Inc"));
//        repository.insert(new Course(2, "Learn GCS", "Google Inc"));
//        //repository.deleteById(1);
//        System.out.println(repository.findById(1));

        //SpringDataJPA-
        repository.save(new Course(1, "Learn AWS", "Amazon Inc"));
        repository.save(new Course(2, "Learn GCS", "Google Inc"));
        //repository.deleteById(1L);
        System.out.println(repository.findById(1L));
        System.out.println(repository.findByAuthor("Amazon Inc") + "find by author");


    }
}
