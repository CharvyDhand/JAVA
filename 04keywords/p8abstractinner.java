public class p8abstractinner {
    public static void main(String[] args) {
  childclass obj=new childclass(){
    public void parent2(){
        System.out.println("23bcs12899");
    }
    };
    obj.parent2();
    obj.parentfunc();
}
}

abstract class parentclass{
    public void parentfunc(){
        System.out.println("Password123@");
    }
    public abstract void parent2();
}
abstract class childclass extends parentclass{
    
}
