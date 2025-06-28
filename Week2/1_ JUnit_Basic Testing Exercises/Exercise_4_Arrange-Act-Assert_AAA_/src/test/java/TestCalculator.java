import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test

    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.sub(3, 2));
    }

}
