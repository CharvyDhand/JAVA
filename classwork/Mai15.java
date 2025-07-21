public class Mai15 {
    public static void main(String[] args) {
      car ob=new car();
      ob.func1(18,1800000,"New");
      ob.func3("sunroof and automatic");
      ob.func2();
    }
}
class vehicle{
    static int average;
    static int price;
    static String model;
    public void func1(int x,int y,String z){
        this.average=x;
        this.price=y;
        this.model=z;
    }
}
class car extends vehicle{
    String feature;
    public void func2(){
       System.out.println("Car Name: XUV");
       System.out.println("Mileage:"+average);
       System.out.println("Price:"+price);
       System.out.println("Model:"+model);
       System.out.println("feature:"+this.feature);
    }
    public void func3(String o){
        this.feature=o;
    }
}
