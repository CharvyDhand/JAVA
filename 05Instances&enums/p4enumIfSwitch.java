public class p4enumIfSwitch {
    public static void main(String[] args){
        Status s=Status.failed;
        if(s==Status.running){
            System.out.println("program is running");
        }else if(s==Status.success){
            System.out.println("program successfully completed");
        }else if(s==Status.pending){
            System.out.println("still pending");
        }else{
            System.out.println("it failed");
        }
        switch(s){
            case running:
            System.out.println("running");
            break;
            case success:
            System.out.println("success");
            break;
            case pending:
            System.out.println("pending");
            break;
            default:
            System.out.println("failed");
            break;
        }
    }
}
enum Status{
    running,success,failed,pending;
}