public class p02sealed {
    public static void main(String[] args) {
        
    }
}
sealed class A permits B,C{

}
sealed class B extends A permits D{

}
final class C extends A{

}
non-sealed class D extends B{
    
}