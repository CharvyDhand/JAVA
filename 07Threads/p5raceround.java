public class p5raceround {
    public static void main(String[] args) {
        Sample obj=new Sample();
        Runnable obj1=()->{
            for(int i=0;i<1000;i++){
                obj.increment();
            }
        };
        Runnable obj2=()->{
            for(int i=0;i<1000;i++){
                obj.increment();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        try {
           t1.join();
           t2.join();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

        System.out.println(obj.count);
    }
}
class Sample{
    public int count=0;
    public synchronized void increment(){
        count++;
    }
}
