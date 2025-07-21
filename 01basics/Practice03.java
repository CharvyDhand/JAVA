import java.util.Scanner;
public class Practice03{
    public static void main(String a[]){
        //calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first operand:");
        int x=sc.nextInt();
        System.out.println("Enter second operand:");
        int y=sc.nextInt();
        System.out.println("Enter operator:");
        char z=sc.next().charAt(0);
        switch(z){
        case '+':
            System.out.println("Sum:"+(x+y));
            break;
        case '-':
            System.out.println("Subtraction:"+(x-y));
            break;
        case '*':
            System.out.println("Multipication:"+(x*y));
            break;
        case '/':
            System.out.println("Division:"+ (float)(x/y));
            break;
        case '%':
            System.out.println("Modulus:"+(x%y));
            break;
        default:
          System.out.println("Error value");
    }
}
}