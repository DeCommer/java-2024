package com.jpahibernate.jpahiberante.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpahibernate.jpahiberante.course.jdbc.Course;

@Component
public class CourseJdbcCommandlineRunner implements CommandLineRunner {
    
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args)throws Exception {
        repository.insert(new Course(1, "Joseph", "Gdut!"));
        repository.insert(new Course(2, "Two", "Gdut!"));
        repository.insert(new Course(3, "Three", "Gdut!"));

        repository.delete(1);

        System.out.println(repository.find(2));
    }

}
