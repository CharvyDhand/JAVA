public class p3runnable {
    public static void main(String[] args) {
        Runnable obj1=new thread1();
        Runnable obj2=new thread2();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}
class thread1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
        }
    }
}
class thread2 implements Runnable{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("hello");
        }
    }
}
