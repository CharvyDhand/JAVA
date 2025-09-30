public class p03record {
    public static void main(String[] args) {
        database s1=new database("Charvy", 20);
        database s2=new database("Nav",89);
        database s3=new database("Ram",17);
        database s4=new database("Ram", 17);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4.equals(s3));
    }    
}
record database(String name, int age){
}
