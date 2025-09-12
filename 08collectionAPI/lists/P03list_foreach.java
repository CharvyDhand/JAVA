// To-Do List Manager (ArrayList + forEach)
// Create a simple To-Do list for tasks.
// Requirements:
// Add multiple tasks using addAll().
// Display all tasks using forEach with a lambda expression.
// Extract a sublist of tasks that are high priority.
// Remove all completed tasks using removeAll().
// Keep only tasks with a specific category using retainAll().
import java.util.*;
public class P03list_foreach {
   public static void main(String[] args) {
    ArrayList<String> todolist=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    ToDoList tdl=new ToDoList();
    System.out.println("Choose the option:\n1. Add mulitple tasks\n2. Display all tasks\n3. Extract high priority sublist");
    System.out.println("4.Remove all completed tasks\n5. Keep task with specific category\n6. To exit the program");
    int choice;
    String input;
    do{
        System.out.print("Enter your choice:");
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
             Collection<String> task=new ArrayList<>();
             System.out.print("Enter your tasks:");
             input=sc.nextLine();
             for(String t:input.split(",")){
                String temp=t.trim();
                if(!temp.isEmpty()){
                    task.add(temp);
                }
             }
             tdl.addTask(todolist,task);
             break;
            case 2:
             System.out.println("To do List:");
             tdl.displayList(todolist);
             break;
            case 3:
             System.out.print("Enter the start index:");
             int start=sc.nextInt();
             sc.nextLine();
             System.out.print("Enter the end index:");
             int end=sc.nextInt();
             sc.nextLine();
             tdl.priorityList(todolist,start,end);
             break;
            case 4:
             Collection<String> task1=new ArrayList<>();
             System.out.println("Enter your tasks:");
             input=sc.nextLine();
             for(String t:input.split(",")){
                String temp=t.trim();
                if(!temp.isEmpty()){
                    task1.add(temp);
                }
             }
             tdl.removeTask(todolist,task1);
             break;
            case 5:
             Collection<String> task2=new ArrayList<>();
             System.out.println("Enter your tasks:");
             input=sc.nextLine();
             for(String t:input.split(",")){
                String temp=t.trim();
                if(!temp.isEmpty()){
                    task2.add(temp);
                }
             }
             todolist.retainAll(task2);
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
class ToDoList{
    public void addTask(ArrayList<String> list,Collection<String> e){
        list.addAll(e);
    }
    public void displayList(ArrayList<String> list){
        list.forEach(System.out::println);
    }
    public void removeTask(ArrayList<String> list, Collection<String> e){
        list.removeAll(e);
    }
    public void priorityList(ArrayList<String> list, int start,int end){
        ArrayList<String> arr=new ArrayList<>(list.subList(start, end));
        System.out.println("Priority list:");
        for(String n:arr){
            System.out.println(n);
        }
    }
}
