// Manage a library of books using LinkedList and iterators.
// Requirements:
// Store book titles in a LinkedList.
// Traverse the list forward and backward using ListIterator.
// Search for a book by title and display its first and last index.
// Remove a book if it is available.
import java.util.*;
public class P02linklist_iterators {
    public static void main(String[] args){
        LinkedList<String> bookTitle=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        BookList bl=new BookList();
        System.out.println("Choose an option\n1. Store a book title\n2.Traverse the list forward\n3.Traverse the list backwards");
        System.out.println("4. Search a book\n5. Remove a book if available\n6. Exit the program");
        int choice;
        String title;
        do{
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                 System.out.print("Enter title name:");
                 title=sc.nextLine();
                 bl.addBook(bookTitle,title);
                 break;
                case 2:
                 System.out.println("List forward traversal:");
                 bl.traverseForward(bookTitle);
                 break;
                case 3:
                 System.out.println("List backward traversal:");
                 bl.traverseBackwards(bookTitle);
                 break;
                case 4:
                 System.out.print("Enter title name:");
                 title=sc.nextLine();
                 bl.searchBook(bookTitle, title);
                 break;
                case 5:
                 System.out.print("Enter title name:");
                 title=sc.nextLine();
                 bl.removeBook(bookTitle, title);
                 break;
                case 6:
                 System.out.println("Exiting the program");
                 break;
                default:
                 System.out.println("Invalid input.");
                 break;
            }
    }while(choice!=6);
}
}
class BookList{
    public void addBook(LinkedList<String> list,String title){
        list.add(title);
    }
    public void traverseForward(LinkedList<String> listtitle){
        Iterator<String> list=listtitle.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
    }
    public void traverseBackwards(LinkedList<String> listtitle){
       ListIterator<String> list=listtitle.listIterator(listtitle.size());
        while(list.hasPrevious()){
            System.out.println(list.previous());
        }
    }
    public void searchBook(LinkedList<String> list, String title){
        if(list.contains(title)){
            System.out.print("First occurence:");
            System.out.println(list.indexOf(title));
            System.out.print("Last occurence");
            System.out.println(list.lastIndexOf(title));
        }else{
            System.out.println("Not present in list.");
        }
    }
    public void removeBook(LinkedList<String> list,String title){
        list.remove(title);
    }
}
