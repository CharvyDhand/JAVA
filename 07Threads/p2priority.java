public class p2priority {
    public static void main(String[] args) {
        thread1 obj1=new thread1();
        thread2 obj2 =new thread2();
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class thread1 extends Thread{
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println("Hello");
        }
    }
}
class thread2 extends Thread{
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println("hi");
        }
    }
}
