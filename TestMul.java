import junit.framework.*;
public class TestMul extends TestCase {
    public void TestMul() {
        int mul = Calculator.multiply(0,5);
        assertTrue(mul == 0);
    }
}