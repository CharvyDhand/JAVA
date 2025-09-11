import java.util.*;
public class MainClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Chatbot cb=new Chatbot("User", 0);
        HashMap<String, List<String>> FriendsChat=new HashMap<>();
        HashMap<String, List<String>> PersonalChat=new HashMap<>();
        System.out.println("Enter number of your friends:");
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
        System.out.println("5. Exit the program");
        int choice;
        do{
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                 System.out.println("Enter your friend name:");
                 String nm=sc.nextLine();
                 System.out.println("Enter you text:");
                 String mess=sc.nextLine();
                 cb.sendMessege(FriendsChat,mess,nm);
                 cb.sendMessege(PersonalChat, mess,nm);
                 System.out.println("Messege sent");
                 break;
                case 2:
                 System.out.println("Enter friend name:");
                 String nm1=sc.nextLine();
                 System.out.println("Enter your text id:");
                 int mid=sc.nextInt();
                 sc.nextLine();
                 cb.delete(FriendsChat,PersonalChat,nm1,mid);
                 System.out.println("Messege deleted for everyone");
                 break;
                case 3:
                 System.out.println("Enter friend name:");
                 String nm3=sc.nextLine();
                 System.out.println("Enter your text id:");
                 int mid1=sc.nextInt();
                 sc.nextInt();
                 cb.delete(PersonalChat,nm3,mid1);
                 System.out.println("Messege deleted for me ");
                 break;
                case 4:
                 System.out.println("Enter friend name:");
                 String nm4=sc.nextLine();
                 System.out.println("Enter your text id:");
                 int mid2=sc.nextInt();
                 sc.nextInt();
                 System.out.println("Enter new messege:");
                 String newmess=sc.nextLine();
                 cb.updateText(PersonalChat,FriendsChat,nm4,mid2,newmess);
                 break;
                case 5:
                 System.out.println("Program exiting");
                 break;
                default:
                 System.out.println("You entered a default value");
            }
        }while(choice!=5);
    }    
}
class People{
    public String name;
    public int uid;
    public People(String name,int uid){
        this.name=name;
        this.uid=uid;
    }
    public People(String name){
        this.name=name;
    }
}
class Chatbot extends People{
    public Chatbot(String name,int uid){
        super(name,uid);
    }
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
}
