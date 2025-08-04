public class p0dynamicmethoddispatched{
    public static void main(String[] args) {
        A obj=new B();
        obj.func();
    }
}
class A{
    public void func(){
        System.out.println("parent class");
    }
}
class B extends A{
    public void func(){
        System.out.println("child class");
    }
}