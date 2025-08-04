class Human{
    private String name;
    private int age;
    public void getname(String n){
        name=n;
    }
    public String printname(){
        return name;
    }
    public void getage(int a){
        age=a;
    }
    public int printage(){
        return age;
    }
}
public class topic01 {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.getname("Charvy");
        obj.getage(20);
        System.out.println(obj.printname()+" : "+obj.printage());
    }
}
