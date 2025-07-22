// game to guess a random number
import java.util.Random;
import java.util.Scanner;
public class Mai10 {
    public static void main(String[] args) {
        System.out.println();
        Scanner obj=new Scanner(System.in);
        Random rj=new Random();
        int r=rj.nextInt(100);
        int x=obj.nextInt();
        guess obj1=new guess();
        obj1.func(r,x);
        System.out.println(r);
    }c   
}
class guess{
    void func(int r,int x){
        if(r==x){
            System.out.println("equal");
        }
        else if((r-x)>0){
            System.out.println("smaller");
        }
        else{
            System.out.println("larger");
        }
    }
}