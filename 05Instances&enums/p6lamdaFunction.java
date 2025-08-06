public class p6lamdaFunction {
    public static void main(String[] args) {
        A1 obj=()->{
            System.out.println("hello");
            System.out.println("for multiple line of code in function");
        };
        obj.func();
        A1 obj1=()->System.out.println("for single line of code in function");
        obj1.func();
        A2 obj2=(int i,int j)->{
            return i+j;
        };
        obj2.func2(4, 4);
        A2 obj3=(i,j)->i+j;
        obj3.func2(3, 4);
    }
}
@FunctionalInterface
interface A1{
   void func();
}
interface A2{
    int func2(int i,int j);
}
