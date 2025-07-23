public class topic03string {
    public static void main(String[] args) {
        String name="Charvy";
        String name2=new String();
        String surname=new String("Dhand");
        System.out.println(name2);
        System.out.println(name);
        System.out.println(name.concat(surname));
        System.out.println(name);
        name=name+"stupid";
        System.out.println(name);
        System.out.println(name.hashCode());
    }
}
