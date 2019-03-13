package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Course course = new Course("Astrophysics", "Neil D. Tyson", "Just a course on stars", 3);

        Course course2 = new Course("Calculus", "Carol Henley", "Rate of Change of the Rate of Change", 3);

        Course course3 = new Course("Freshman English", "Geraldine Pegman", "Learn your language children", 3);

        repository.save(course);
        repository.save(course2);
        repository.save(course3);
    }
}
