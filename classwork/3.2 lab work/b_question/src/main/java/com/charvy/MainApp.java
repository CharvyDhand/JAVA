package com.charvy;

import com.charvy.model.Student;
import com.charvy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        // CREATE
        addStudent("Alice", "alice@example.com", 20);
        addStudent("Bob", "bob@example.com", 22);

        // READ
        listStudents();

        // UPDATE
        updateStudentEmail(1, "alice_new@example.com");

        // DELETE
        deleteStudent(2);

        HibernateUtil.shutdown();
    }

    public static void addStudent(String name, String email, int age) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student(name, email, age);
        session.save(student);

        tx.commit();
        session.close();
        System.out.println("Added: " + student);
    }

    public static void listStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("from Student", Student.class).list();
        System.out.println("Students in DB:");
        students.forEach(System.out::println);
        session.close();
    }

    public static void updateStudentEmail(int id, String newEmail) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, id);
        if(student != null) {
            student.setEmail(newEmail);
            session.update(student);
        }

        tx.commit();
        session.close();
        System.out.println("Updated Student ID " + id);
    }

    public static void deleteStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, id);
        if(student != null) {
            session.delete(student);
        }

        tx.commit();
        session.close();
        System.out.println("Deleted Student ID " + id);
    }
}
