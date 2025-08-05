public class p0basicinstance {
    public static void main(String[] args) {
       C obj=new C();
       obj.func(); 
       obj.func1();
       System.out.println(A.a);
    }
}
interface A{
    void func();
    void func1();
    int a=5;
}
abstract class B implements A{    // this follows abstraction concept
// interface B extends A{  in this case you cant implements any function 
    public void func(){
        System.out.println("hello");
    }
}
class C extends B{
    public void func1(){
        System.out.println("hello 1");
    }
}
