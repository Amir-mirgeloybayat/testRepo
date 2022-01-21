
public class Calculator {
    public static int add(int a, int b) {return a + b;}
    public static int subtract(int a, int b) {return b - a;}
    public static int divide(int a, int b) throws IllegalArgumentException{
        if (b == 0) throw new IllegalArgumentException("Divisor can't be zero");
        else return a / b;
    }
    public static int multiply(int a, int b) {return a * b;}
    public static void printEquation(int a, int b, String operation) 
        throws IllegalArgumentException {
            if (operation.isEmpty())
                throw new IllegalArgumentException("define opeartion");
            else {
                System.out.println(a + " " + operation + " " + b);
            }
        }
}