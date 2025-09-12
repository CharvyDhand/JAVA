// Create a system to store student names in a class.
// Requirements:
// Add a student at the end of the list.
// Insert a student at a specific position.
// Remove a student by name or index.
// Replace a student’s name at a given index.
// Display the total number of students.
import java.util.*;
public class P01basics {
    public static void main(String[] args){
        // Collection<String> name=new ArrayList<>();
        List<Integer> num=new ArrayList<>(Arrays.asList(1,2,3));
        List<String> nameList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        StudentList sl=new StudentList();
        System.out.println("Choose operation to perform:\n1.Add a student at end of the list.\n2.Insert at specific position\n3. Remove by name or index");
        System.out.println("4.Replace a students name\n5. Display all student name.\n 6.Exit");
        int choice;
        String name;
        int position;
        do{
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                 System.out.print("Enter the name:");
                 name=sc.nextLine();
                 sl.addName(nameList,name);
                 break;
                case 2:
                 System.out.print("Enter the name:");
                 name=sc.nextLine();
                 System.out.print("Enter the index:");
                 position=sc.nextInt();
                 sc.nextLine();
                 sl.addName(nameList,name,position);
                 break;
                case 3:
                 System.out.print("Enter the name:");
                 name=sc.nextLine();
                 sl.removeName(nameList,name);
                 break;
                case 4:
                 System.out.print("Enter the index:");
                 position=sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter name:");
                 name=sc.nextLine();
                 sl.replaceName(nameList,name,position);
                 break;
                case 5:
                 System.out.println("Students List:");
                 sl.displayList(nameList);
                 break;
                case 6:
                 System.out.println("Exiting the program");
                 break;
                default:
                 System.out.println("Invalid input");
                 break;
            }
        }while(choice!=6);
    }    
}
class StudentList{
    public void addName(List<String> list,String name){
        list.add(name);
    }
    public void replaceName(List<String> list, String name, int position){
        if(list.size()>=position){
        list.set(position,name);
        }else{
            System.out.println("Index not found");
        }
    }
    public void removeName(List<String> list, String name){
        if(list.contains(name)){
            list.remove(name);
        }else{
            System.out.println("Name not found");
        }
    }
    public void removeName(List<String> list,int position){
        if(position<=(list.size())){
            list.remove(position);
        }else{
            System.out.println("Index out of range");
        }
    }
    public void addName(List<String> list, String name,int position){
        list.add(position,name);
    }
    public void displayList(List<String> list){
        for(String n:list){
            System.out.println(n);
        }
    }
}

