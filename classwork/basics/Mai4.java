import java.util.Scanner;
public class Mai4{
    public static void main(String[] args) {
        Rectangle obj1=new Rectangle();
        System.out.println(obj1.result);
    } 
}
class Rectangle{
    Scanner oj2=new Scanner(System.in);
    int x=oj2.nextInt();
    int y=oj2.nextInt();
    int result=x*y;
}