public class p7anonyinnerclass{
    public static void main(String[] args) {
        anony obj=new anony(){
            public void func(){
                System.out.println("in anonymous class");
            }
        };
        obj.func();
    }
}
class anony{
    public void func(){
        System.out.println("this is function anonymous");
    }
}