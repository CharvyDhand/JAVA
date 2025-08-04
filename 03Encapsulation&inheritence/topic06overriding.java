public class topic06overriding {
    public static void main(String[] args) {
        B obj=new B();
        obj.func();
    }
}
class A{
    public void func(){
        System.out.println("Parent class");
    }
}
class B extends A{
    public void func(){
        super.func();
        System.out.println("child class");
    }
}
