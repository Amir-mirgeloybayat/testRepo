import junit.framework.*;
public class TestAdd extends TestCase {
    public void TestAdd() {
        int sum = Calculator.add(-4,5);
        assertTrue(sum == 1);
    }
}