public class p1interface{
    public static void main(String[] args) {
        Computer lp=new Laptop();
        Computer dt=new Desktop();
        lp.code(lp);
        dt.code(dt);
    }
}
interface Computer{
    void code(Computer obj);
}
class Laptop implements Computer{
    public void code(Computer obj){
        System.out.println("this is using laptop");
    }
}
class Desktop implements Computer{
    public void code(Computer obj){
        System.out.println("this is using desktop");
    }
}