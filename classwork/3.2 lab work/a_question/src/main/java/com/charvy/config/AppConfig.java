package com.charvy.config;

import com.charvy.model.Course;
import com.charvy.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Computer Science");
    }

    @Bean
    public Student student() {
        return new Student(course());
    }
}
