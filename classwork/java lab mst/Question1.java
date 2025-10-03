import java.util.*;

class Employee {
    int id; String name; double salary;
    Employee(int id,String name,double salary){this.id=id;this.name=name;this.salary=salary;}
    public String toString(){return "ID:"+id+" Name:"+name+" Salary:"+salary;}
}

public class Question1 {
    public static void main(String[] args) {
        LinkedList<Employee> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("\n1.Add 2.Display 3.Search 4.Remove 5.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("ID: "); int id=sc.nextInt(); sc.nextLine();
                    System.out.print("Name: "); String name=sc.nextLine();
                    System.out.print("Salary: "); double sal=sc.nextDouble();
                    list.add(new Employee(id,name,sal));
                    System.out.println("Employee added!");
                    break;
                case 2:
                    if(list.isEmpty()) System.out.println("No employees.");
                    else list.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID: "); id=sc.nextInt();
                    boolean found=false;
                    for(Employee e:list){ if(e.id==id){System.out.println(e); found=true; break;}}
                    if(!found) System.out.println("Not found.");
                    break;
                case 4:
                    System.out.print("Enter ID: "); id=sc.nextInt();
                    list.removeIf(e->e.id==id);
                    System.out.println("Removed (if existed).");
                    break;
                case 5:
                    System.out.println("Exit."); break;
                default:
                    System.out.println("Invalid!");
            }
        }while(ch!=5);
    }
}
