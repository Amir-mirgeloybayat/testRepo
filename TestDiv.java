import junit.framework.*;
public class TestDiv extends TestCase {
    public void TestDiv() {
        int div = Calculator.divide(9, 4);
        assertTrue(div == 2);
    }
}