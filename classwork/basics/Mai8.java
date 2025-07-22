import javax.sound.sampled.SourceDataLine;

public class Mai8 {
    public static void main(String[] args) {
      func.first();
      func.second.funbb+();   
    }
}
class func{
    static void first(){
        System.out.println("static function called without reference variable");
    }
    static class second{
        static void funbb(){
            System.out.println("hello");
        }
    }
}
