public class p3enumBasics {
    public static void main(String[] args) {
        Status s=Status.running;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss=Status.values();
        System.out.println(ss[3]);
        for(Status i:ss){
            System.out.println(i);
            System.out.println(i.ordinal());
        }
    }
}
enum Status{
    running,failed,pending,success;
}
