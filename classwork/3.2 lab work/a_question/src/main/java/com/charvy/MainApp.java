package com.charvy;

import com.charvy.config.AppConfig;
import com.charvy.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Initialize Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Student bean
        Student student = context.getBean(Student.class);
        student.display();

        context.close();
    }
}
