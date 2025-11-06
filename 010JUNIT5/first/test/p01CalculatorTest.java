package first.test;
// File: src/test/java/CalculatorTest.java
import org.junit.jupiter.api.Test;
import Enter.p01Calculator;
import static org.junit.jupiter.api.Assertions.*;

class p01CalculatorTest {
    
    @Test
    void add_twoNumbers_returnsSum() {
        p01Calculator calc = new p01Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    // @Test
    // void subtract_twoNumbers_returnsDifference() {
    //     p01Calculator calc = new p01Calculator();
    //     System.out.println("second");
    // }
}

