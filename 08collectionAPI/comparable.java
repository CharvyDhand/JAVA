import java.util.*;
public class comparable {
    public static void main(String[] args){
      Student obj1=new Student("Charvy", 20);
      Student obj2=new Student("Tina",34);
      Student obj3=new Student("tina",12);
      List<Student> list = new ArrayList<>();
      list.add(obj1);
      list.add(obj2);
      list.add(obj3);
      Collections.sort(list);
      for(Student s:list){
        System.out.println(s.age+":"+s.name);
      }
    }
}
class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student that){
        if(this.age>that.age) return 1;
        else return -1;
    }
}