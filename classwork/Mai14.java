public class Mai14 {
    public static void main(String[] args) {
        child ob=new child();
        ob.func();
        ob.func2();
    }
}
class parent{
    public void func(){
        System.out.println("parent class called");
    }
}
class child extends parent{
    public void func2(){
        System.out.println("child class called");
    }
}
