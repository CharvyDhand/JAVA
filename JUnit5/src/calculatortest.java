import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calculatortest {

    @Test
    void add_twoNumbers_returnsSum() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
}
