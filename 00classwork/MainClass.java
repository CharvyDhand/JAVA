import java.util.*;
public class MainClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Chatbot cb=new Chatbot();
        HashMap<String, List<String>> FriendsChat=new HashMap<>();
        HashMap<String, List<String>> PersonalChat=new HashMap<>();
        System.out.print("Enter number of your friends:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String user=sc.nextLine();
            FriendsChat.put(user,new ArrayList<>());
            PersonalChat.put(user,new ArrayList<>());
        }
        System.out.println("Choose an operation:");
        System.out.println("1. To send a text to a friend");
        System.out.println("2. To delete message for me ");
        System.out.println("3. To delete messege for everyone");
        System.out.println("4. To update a messege");
        System.out.println("5. Display");
        System.out.println("6. Exit the program");
        int choice;
        String name;
        int index;
        String messege;
        do{
            System.out.print("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                 System.out.print("Enter your friend name:");
                 name=sc.nextLine();
                 System.out.print("Enter you text:");
                 messege=sc.nextLine();
                 cb.sendMessege(FriendsChat,messege,name);
                 cb.sendMessege(PersonalChat, messege,name);
                 System.out.println("Messege sent");
                 break;
                case 2:
                 System.out.print("Enter friend name:");
                 name=sc.nextLine();
                 System.out.print("Enter your text id:");
                 index=sc.nextInt();
                 sc.nextLine();
                 cb.delete(PersonalChat,name,index);
                 System.out.println("Messege deleted for me");
                 break;
                case 3:
                 System.out.println("Enter friend name:");
                 name=sc.nextLine();
                 System.out.println("Enter your text id:");
                 index=sc.nextInt();
                 sc.nextLine();
                 cb.delete(FriendsChat, PersonalChat,name,index);
                 System.out.println("Messege deleted for me ");
                 break;
                case 4:
                 System.out.print("Enter friend name:");
                 name=sc.nextLine();
                 System.out.print("Enter your text id:");
                 index=sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter new messege:");
                 messege=sc.nextLine();
                 cb.updateText(PersonalChat,FriendsChat,name,index,messege);
                 break;
                case 5:
                 System.out.println("The text sent to all:");
                 cb.display(FriendsChat);
                 break;
                case 6:
                 System.out.println("Program exiting");
                 break;
                default:
                 System.out.println("You entered a default value");
            }
        }while(choice!=6);
    }    
}
class Chatbot{
    public void sendMessege(HashMap<String, List<String>> map, String text,String name){
       map.get(name).add(text);
    }
    public void delete(HashMap<String, List<String>> map1, HashMap<String, List<String>> map2,String keyid, int textId){
        map1.get(keyid).remove(textId);
        map2.get(keyid).remove(textId);
    }
    public void delete(HashMap<String, List<String>> map1,String keyid, int textId){
        map1.get(keyid).remove(textId);
    }
    public void updateText(HashMap<String, List<String>> map1, HashMap<String, List<String>> map2, String nm, int mid, String mess){
        map1.get(nm).set(mid,mess);
        map2.get(nm).set(mid,mess);
    }
    public void display(HashMap<String, List<String>> map){
        for(Map.Entry<String, List<String>> e:map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
