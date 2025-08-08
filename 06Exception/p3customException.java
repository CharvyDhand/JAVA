public class p3customException {
    public static void main(String[] args) {
        int i=0;
        int j;
        try{
            // j=12/i;
            j=0;
            if(j==0){
                throw new NewException("It was zero ");
            }
        }catch(NewException e){
            j=1;
            System.out.println("this is default value"+e);
        }
    }    
}
class NewException extends Exception{
    public NewException(String string){
        super(string);
    }
}