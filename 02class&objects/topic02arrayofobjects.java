public class topic02arrayofobjects {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="charvy";
        s1.uid=1;
        Student s2=new Student();
        s2.name="avreet";
        s2.uid=2;
        Student a[]=new Student[2];
        a[0]=s1;
        a[1]=s2;
        for(int i=0;i<a.length;i++){
            System.out.println("Name: "+a[i].name);
            System.out.println("Rollno: "+a[i].uid);
        }
    }
}
class Student{
    public String name;
    public int uid;
}
