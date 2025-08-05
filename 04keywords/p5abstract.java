public class p5abstract {
    public static void main(String[] args) {
       C obj=new C(9,10);
       obj.add();
       obj.sub();
    }
}
abstract class A{
    private int a;
    protected int b;
    A(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int getA(){
        return a;
    }
    public abstract void add();
    public abstract void sub();
}
abstract class B extends A{
    B(int a,int b){
        super(a,b);
    }
    public void add(){
        System.out.println(getA()+b);
    }
}
class C extends B{
    C(int a,int b){
        super(a,b);
    }
    public void sub(){
        System.out.println(getA()-b);
    }  
}

