public class p4wrapperclass {
    public static void main(String[] args) {
        int num=5;
        //Boxing
        Integer num1=new Integer(num);
        System.out.println(num1);
        //autoboxing
        Integer num2=num;
        System.out.println(num2);
        //unboxing
        int num3=num2.intValue();
        System.out.println(num3);
        int num4=num2;
        System.out.println(num4);
    }
}