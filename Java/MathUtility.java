package Java;

public class MathUtility {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + MathUtility.add(10, 5));
        System.out.println("Subtraction: " + MathUtility.subtract(10, 5));
        System.out.println("Multiplication: " + MathUtility.multiply(10, 5));
        System.out.println("Division: " + MathUtility.divide(10, 5));
    }
}
