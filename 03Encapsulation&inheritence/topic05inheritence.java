public class topic05inheritence {
    public static void main(String[] args) {
        ScientificCalculator obj=new ScientificCalculator();
        int a=obj.add(4, 7);
        int b=obj.sub(7,4);
        int c=obj.mul(2,2);
        double d=obj.div(25,5);
        double e=obj.power(2,2);
        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
    }
}
class Calculator{
    public int add(int n,int m){
        return n+m;
    }
    public int sub(int n,int m){
        return n-m;
    }
}
class AdvanceCalculator extends Calculator{
    public int mul(int n,int m){
        return n*m;
    }
    public double div(int n,int m){
        return n/m;
    }
}
class ScientificCalculator extends AdvanceCalculator{
    public double power(double n,double m){
        return (double)Math.pow(n,m);
    }
}
