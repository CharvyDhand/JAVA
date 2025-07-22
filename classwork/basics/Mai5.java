public class Mai5 {
    public static void main(String[] args) {
        blackbox ob= new blackbox();
        ob.inidim(2,3);
        ob.show();
    }
}
class blackbox{
    private int length,breadth;
    public void inidim(int l,int b){
        length=l;
        breadth=b;
    }
    public void show(){
        System.out.println(length);
        System.out.println(breadth);
    }
}
