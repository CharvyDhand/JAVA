public class p4throws {
    public static void main(String[] args) {
        demo1 obj=new demo1();
          try {
            obj.B();   
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
         }catch (Exception e){
            System.out.println("this is exception case");
         }
    }    
}
class demo{
    public void A() throws ClassNotFoundException{
        Class.forName("hello");
    }
}
class demo1{
    demo obj=new demo();
    public void B() throws Exception{
       obj.A();
       System.out.println("here 1");
       int j=4/0;
       System.out.println("here 2");
    }
}
 