public class p0trycatch {
  public static void main(String[] args) {
    int i=0;
    int j=8;
    try{
        j=j/i;
    }catch(Exception e){
        System.out.println("something happened:"+e);
    }
    System.out.println("even after run time exception the code didnt stop execution");
  }    
}
