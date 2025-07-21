import java.util.Scanner;
public class Practice02{
    public static void main(String[] args){
        //question 1 
    System.out.println(7/4*9/2); 
      //question 2
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value :");
    char x=sc.next().charAt(0);  //next() is for string and string cant be converted into char so we just store first letter in x 
    char y=(char)(x+8);
    System.out.println("Encrypted value:"+ y);
    System.out.println("decripted value:"+ (char)(y-8));
    //question 3
    System.out.println("enter a number");
    int a=sc.nextInt();
    int b=44;
    if(a>b){
        System.out.println("given number is greater ");
    }else
    System.out.println("given number is smaller");
    }
}