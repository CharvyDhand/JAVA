public class p6innerclass {
 public static void main(String[] args) {
     outerClass obj1=new outerClass();
     obj1.outerfunc();
     obj1.v=4;
     System.out.println(obj1.v);
    outerClass.innerclass obj2=obj1.new innerclass();
     obj2.innerfunc();
     obj2.b=7;
     System.out.println(obj2.b);

 }   
}
class outerClass{
    int v;
    public void outerfunc(){
        System.out.println("this is outer class");
    }
    class innerclass{
        int b;
        public void innerfunc(){
            System.out.println("in inner class");
        }
    }
}

