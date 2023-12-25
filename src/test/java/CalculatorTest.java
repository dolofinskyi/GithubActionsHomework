
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(15, calculator.calculate(10, 5, (a, b) -> a + b));
    }

    @Test
    public void testInvalidAdd() {
        assertNotEquals(20, calculator.calculate(10, 5, (a, b) -> a + b));
    }

    @Test
    public void testSub() {
        assertEquals(1, calculator.calculate(9, 8, (a, b) -> a - b));
    }

    @Test
    public void testInvalidSub() {
        assertNotEquals(1, calculator.calculate(10, 5, (a, b) -> a - b));
    }
}