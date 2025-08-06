public class p2multipleinherit {
    public static void main(String[] args) {
        Car obj=new Car();
        obj.averageOfCar();
        obj.speedOfCar();
    }
}
interface Speed{
    void speedOfCar();
}
interface Average{
    void averageOfCar();
}
class Car implements Average,Speed{
    public void speedOfCar(){
        System.out.println("Speed of car is 50Km per hour ");
    }
    public void averageOfCar(){
        System.out.println("average is 15");
    }
}
