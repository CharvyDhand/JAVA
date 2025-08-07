public class p1multiplecatch {
    public static void main(String[] args) {
    int i=9;
    int j=18;
    int arr[]=new int[5]; 
    try{
        j=j/i;
        System.out.println(j);
        System.out.println(arr[6]);
    }catch(ArithmeticException e){
         System.out.println("you can divide a number by zero");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("you are accessing elemnet out of memory");
    }catch(Exception e){
        System.out.println("something happened:"+e);
    }
    System.out.println("even after run time exception the code didnt stop execution");
  }        
}
