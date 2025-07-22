import java.util.Scanner;
import java.util.*;
public class Mai7{
    public static void main(String[] args) {
        Scanner ob1=new Scanner(System.in);
        int x=ob1.nextInt();
        boolean re=true;
        for(int i=2;i<=(x/2);i++){
            if(x%i==0){
              re=false;
              break;   
            }
        }
        if(!re){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
      
    }
    
} 
