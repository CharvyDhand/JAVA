package first.test;
import Enter.p02reversestring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class p02 {
    @Test
    void testp02(){
        p02reversestring obj=new p02reversestring();
        String actual=obj.reversestring("java");
        String expect="avaj";
        assertEquals(expect,actual);
    }
}
