public class p5enumsConstructor {
    public static void main(String[] args) {
        Laptop lp=Laptop.Macbook;
        System.out.println(lp.getPrice());
        Laptop[] arr=Laptop.values();
        for(Laptop i:arr){
            System.out.println(i+": "+i.getPrice());
        }
    }
}
enum Laptop{
   Macbook(230),XPS(150),victus;
   private int price;
   private Laptop(int price){
    this.price=price;
   }
   private Laptop(){
    this.price=400;
   }
   public int getPrice(){
    return price;
   }
}
