
public class Calculator {
    public static int add(int a, int b) {return a + b;}
    public static int subtract(int a, int b) {return a - b;}
    public static int divide(int a, int b) throws IllegalArgumentException{
        if (b == 0) throw new IllegalArgumentException("Divisor can't be zero");
        else return a / b;
    }
    public static int multiply(int a, int b) {return a * b;}
}