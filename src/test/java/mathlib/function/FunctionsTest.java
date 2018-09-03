package mathlib.function;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {


    @Test
    public void testSqr() {

        double delta = 0.001;
        Function sqr = Functions.SQR;
        assertEquals(1, sqr.calculate(1), delta);
        assertEquals(4, sqr.calculate(2), delta);
        assertEquals(9, sqr.calculate(3), delta);
    }

    @Test
    public void testSqrt() {

        double delta = 0.001;
        Function sqrt = Functions.SQRT;
        assertEquals(1, sqrt.calculate(1), delta);
        assertEquals(2, sqrt.calculate(4), delta);
        assertEquals(3, sqrt.calculate(9), delta);
    }
}
