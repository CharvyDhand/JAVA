import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int id;
    double marks;

    Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
}
public class MediumLevel {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Ravi", 101, 85),
            new Student("Aditi", 102, 92),
            new Student("Kiran", 103, 78),
            new Student("Mohan", 104, 65),
            new Student("Sneha", 105, 55)
        );

        System.out.println("Students scoring above 75%:");
        students.stream()
                .filter(s -> s.marks > 75)              
                .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
                .map(s -> s.name)                       
                .forEach(System.out::println);          
    }
}
