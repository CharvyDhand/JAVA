
public class topic02 {
    public static void main(String[] args) {
        Human obj=new Human();
        System.out.println(obj.getname()+" "+obj.getage());
        Human obj1=new Human("Ayaan",22);
        System.out.println(obj1.getname()+" "+obj1.getage());
        Human obj2=new Human("Aryan");
        System.out.println(obj2.getname()+" "+obj2.getage());
        Human obj3=new Human(23);
        System.out.println(obj3.getname()+" "+obj3.getage());
    }
}class Human{
    private String name;
    private int age;
    // public Human(){
// by default in built constructor
    // }
    public Human(){
        name="charvy";
        age=20;
    }
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Human(String name){
        this.name=name;
    }
    public Human(int age){
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}
