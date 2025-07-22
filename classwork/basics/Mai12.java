import java.util.Scanner;
public class Mai12 {
    public static void main(String[] args) {
        account oj=new account();
        int n=20000;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter D for deposite and W for withdraw:");
        String u=ob.next();
        if(u.equals("D")){
            System.out.println("enter amount to be deposited:");
            int x=ob.nextInt();
            oj.deposite(n,x);
        }
        else if(u.equals("W")){
            System.out.println("enter amount to be withdrawed:");
            int x=ob.nextInt();
            oj.withdraw(n,x);
        }
        else {
            System.out.println("invalid choice");
        }
    }
    
}
class account{
    void deposite(int n,int d){
        System.out.println(n+d);
    }
    void withdraw(int n,int d){
        if(n-d<0){
            System.out.println("invalid");
            return;
        }
        System.out.println(n-d);
    }
}
