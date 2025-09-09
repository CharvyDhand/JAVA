public class p4lambda {
    public static void main(String[] args) {
        Runnable obj=()->{
            for(int i=0;i<5;i++){
                System.out.println("hello");
            }
        };
        Thread t1=new Thread(obj);
        t1.start();
    }
}
