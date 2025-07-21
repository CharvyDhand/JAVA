import java.util.Scanner;
public class Mai2 {
    public static void main(String[] args) {
        System.out.println("Enter name:");
        Student ob1=new Student();
        System.out.println(ob1.name);
        System.out.println(ob1.age);
    } 
}
class Student{
    int age=2;
    Scanner ob2 =new Scanner(System.in);
    String name=ob2.nextLine();
}
