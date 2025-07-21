import java.util.Scanner;
public class Practice01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks of English:");
        float x=sc.nextInt();
        System.out.print("Enter Marks of maths:");
        float y=sc.nextInt();
        System.out.print("Enter Marks of chemistry:");
        float z=sc.nextInt();
        System.out.print("Enter Marks of physics:");
        float a=sc.nextInt();
        System.out.print("Enter Marks of biology:");
        float b=sc.nextInt();
      System.out.println("Percentage: " + ((a + b + z + x + y) / 500.0f) * 100);
    }
}
