public class topic04anonymousobj {
    public static void main(String[] args) {
        new Basic().func();
        new Basic().func();
    }
}
class Basic{
    public void func(){
        System.out.println("function is called");
    }
}
