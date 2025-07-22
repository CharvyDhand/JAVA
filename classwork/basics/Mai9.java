// searching sorting and reverse the array
import java.util.Scanner;
public class Mai9 {
    public static void main(String[] args) {
        Scanner ob1=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            a[i]=ob1.nextInt();
        }
        operat ob2=new operat();
        ob2.sort(a);
        System.out.println("array");
        for(int i=0;i<10;i++){
           System.out.println(a[i]);
        }
        ob2.search(a,6);
        ob2.reverse(a);

    }
    
}
class operat{
    void search(int[] a,int n){
        for(int i=0;i<10;i++){
            if(a[i]==n){
            System.out.println(i);
            return;
            }
        }
        System.out.println("not found");
    }
    void sort(int[] a){
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    void reverse(int[] a){
        System.out.println("reverse");
        for(int i=9;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
