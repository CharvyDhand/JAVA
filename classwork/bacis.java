// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanob= new Scanner(System.in);
        //new for memory allocation 
        //scanob is object 
        //by default datatype  is string
        int a=scanob.nextInt();
        //nextin when use the allocated memory
        //system means we are gona take input from user
        // scanner * for all type of datatypes
        System.out.println("Try programiz.pro"+a);
    }
}
/*
import java.util.Scanner;
public class Main {
    int x=5;
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();
    String re=obj.next();
    int r=a+b;
    System.out.println(re+r);
    Main obj2=new Main();
    System.out.println(obj2.x);
}
 int y=7;
}
class second{
    public static void main(String[] args){
            Main ob=new Main();
            System.out.println(ob.y);
    }
}
*/