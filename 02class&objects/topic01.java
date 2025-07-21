
public class topic01 {
    public static void main(String[] args) {
       int num1=3;
       int num2=5;
       Calculator calc=new Calculator();
       System.out.println(calc.add(num1,num2));   
    }
    
}
class Calculator{
    int a;
    public int add(int num1,int num2){
        return num1+num2;

    }
}