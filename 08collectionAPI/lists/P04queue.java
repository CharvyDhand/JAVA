// Recent Search History (LinkedList as Queue)
// Implement a recent search history system where the most recent search is at the front.
// Requirements:
// Add a search term at the beginning (addFirst()) and end (addLast()).
// Display the first and last search terms using peekFirst() and peekLast().
// Remove the oldest search using removeLast().
// Safely poll searches using poll() and pollFirst().
import java.util.*;
public class P04queue {
    public static void main(String[] args) {
        LinkedList<String> historylist=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your choice:\n1. Add your new search\n2. Add older entry\n3. Display most recent and older history");
        System.out.println("4. Display whole list\n5. Remove the oldest one\n 6. Remove the most recent");
        System.out.println("7. To exit the program");
        int choice;
        String search;
        do{
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                 System.out.print("Enter search:");
                 search=sc.nextLine();
                 historylist.addFirst(search);
                 break;
                case 2:
                 System.out.print("Enter search:");
                 search=sc.nextLine();
                 historylist.addLast(search);
                case 3:
                 System.out.print("Top search:");
                 System.out.println(historylist.peekFirst());
                 System.out.print("bottom search:");
                 System.out.println(historylist.peekLast());
                 break;
                case 4:
                 System.out.println("History list:");
                 historylist.forEach(System.out::println);
                 break;
                case 5:
                 historylist.removeLast();
                 break;
                case 6:
                 historylist.pollFirst();
                 break;
                case 7:
                 System.out.println("Exiting the program");
                 break;
                default:
                 System.out.println("Invalid choice");
                 break;
            }
        }while(choice!=7);
    }
}
