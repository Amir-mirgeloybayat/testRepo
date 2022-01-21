import junit.framework.*;
public class TestSub extends TestCase {
    public void Testsub() {
        int sub = Calculator.subtract(-4,5);
        assertTrue(sub == -9);
    }
}