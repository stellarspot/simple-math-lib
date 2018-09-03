package mathlib.function;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {


    @Test
    public void testSqr() {

        double delta = 0.001;
        assertEquals(1, Functions.SQR.calculate(1), delta);
        assertEquals(4, Functions.SQR.calculate(2), delta);
        assertEquals(9, Functions.SQR.calculate(3), delta);
    }
}
