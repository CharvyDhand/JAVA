public class topic04static {
    public static void main(String[] args) {
       Mobile mb=new Mobile();
       mb.price=2000;
       Mobile mb1=new Mobile();
       mb1.price=3000;
       Mobile arr[]=new Mobile[2];
       arr[0]=mb;
       arr[1]=mb1;
       for(Mobile n:arr ) {
          System.out.println(Mobile.name+":"+n.price);
       }
       Mobile.func1();
       Mobile.func2(mb1);
    }
}
class Mobile{
    static String name;
    int price;
    public Mobile(){
        price=0;
        System.out.println("constructor called");
    }
    static{
        name="Customer";
        System.out.println("static method called");
    }
    public static void func1(){
        System.out.println("we can access only static variable here:"+ name);
    }
    public static void func2(Mobile obj){
        System.out.println("we can have instance variable also here:"+obj.price);
    }
}
