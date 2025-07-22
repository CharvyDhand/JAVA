
public class topic01class{
    public static void main(String[] args) {
       int num1=3;
       int num2=5;
       int num3=4;
       Calculator calc2= new Calculator();
       Calculator calc=new Calculator();
       System.out.println(calc.add(num1,num2,num3));
       calc2.a=6;
       System.out.println(calc.a);
       System.out.println(calc2.a);

    }
}
class Calculator{
    int a=5;
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2, int num3){
        return num1+num2+num3;
    }
    public double add(double num1, int num2){
        return num1+num2;
    }
}