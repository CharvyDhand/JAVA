public class p1finalkeyword {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.func();
        obj2.func2();
    }
}
final class A{
   public void func(){
    System.out.println("class A");
   }
}
class B{
    final int a=10;
    // a=20; cant change value 
    final void func2(){
        System.out.println(a);
    }
}