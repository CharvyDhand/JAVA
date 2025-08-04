public class p3typecastingobjects {
   public static void main(String[] args) {
    //upcasting
    A obj=(A) new B();    // is equal to A obj=new B();
    obj.show();   //overriding
    obj.see1();
    // obj.see2(); not possible without downcasting 
    B obj1=(B) obj;
     obj1.show();   //overriding
    obj1.see1();
    obj1.see2();
   } 
}
class A{
    public void show(){
        System.out.println("show in A");
    }
    public void see1(){
        System.out.println("see in A");
    }
}
class B extends A{
   public void show(){
    System.out.println("show in B");
   }
   public void see2(){
    System.out.println("see in B");
   }
}
