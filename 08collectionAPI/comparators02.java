import java.util.*;
public class comparators02{
    public static void main(String[] args) {
      Comparator<Student> com=new Comparator<Student>() {
        public int compare(Student i, Student j){
            if(i.age>j.age){
                return 1;
            }
            else  return -1;
        }
      };  
      Student obj1=new Student("Charvy", 20);
      Student obj2=new Student("Tina",34);
      Student obj3=new Student("tina",12);
      List<Student> list = new ArrayList<>();
      list.add(obj1);
      list.add(obj2);
      list.add(obj3);
      Collections.sort(list,com);
      for(Student s:list){
        System.out.println(s.age+":"+s.name);
      }
    }
}
class Student{
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}