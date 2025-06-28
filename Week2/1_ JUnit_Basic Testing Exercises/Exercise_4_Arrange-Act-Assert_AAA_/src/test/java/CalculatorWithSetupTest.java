import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorWithSetupTest {
    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup: Calculator created");
    }

    @After
    public void tearDown() {
        calc = null;
        System.out.println("Teardown: Calculator destroyed");
    }

    @Test
    public void testAdd() {

        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {

        int result = calc.sub(5, 2);
        assertEquals(3, result);
    }
}
