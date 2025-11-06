package junit2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    void testarea(){
        App a=new App();
        assertEquals(24,a.area(6,4),"Area calculates is wrong");

    }
    @Test
    void testarea1(){
        App a=new App();
        assertNotEquals(22 ,a.area(7,3),()->"Area calculates is wrong");

    }

} 
