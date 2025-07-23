public class topic03stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        sb2.append("world");
        System.out.println(sb2.capacity());
        sb2.insert(2,"world");
        System.out.println(sb2);
        sb2.deleteCharAt(7);
        System.out.println(sb2);
        StringBuilder sb3=new StringBuilder();
        System.out.println(sb3.capacity());
    }
}
