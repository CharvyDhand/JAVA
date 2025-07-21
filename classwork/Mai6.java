import java.util.Scanner;
public class Mai6{
    public static void main(String[] args){
        Scanner ok=new Scanner(System.in);
        int x=ok.nextInt();
        int y=ok.nextInt();
        Arithmetic ob2=new Arithmetic();
        ob2.add(x,y);
        ob2.sub(x,y);
        ob2.mod(x,y);
    }
}
class Arithmetic{
    void add(int x,int y){
         System.out.println(x+y);
    }
    void sub(int x,int y){
        System.out.println(x-y);
    }
    void mod(int x,int y){
        System.out.println(x%y);
    }
    }

