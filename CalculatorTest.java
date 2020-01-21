import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator(5, 3);
    }

    @Test
    public void calculateTest() {
        assertEquals(15, calculator.Multiplicate(), 0.1);
    }
}
