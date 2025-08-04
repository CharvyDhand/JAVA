
public class topic03thissuper {
  public static void main(String[] args) {
    B obj=new B();
  }
    
}
class A extends Object{
    public A(){
        super();
        System.out.println("parent class");
    }
    public A(int n){
        super();
        System.out.println("parent class int");
    } 
}
class B extends A{
    public B(){
        super(5);
        System.out.println("child class");
    }
    public B(int n){
        this();
        System.out.println("child class init");
    }
}