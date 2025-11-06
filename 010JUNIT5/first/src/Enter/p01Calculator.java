package Enter;
// File: src/main/java/Calculator.java
public class p01Calculator {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts b from a
    public int subtract(int a, int b) {
        return a - b;
    }

    // Optional main() just to run from terminal if desired
    public static void main(String[] args) {
        p01Calculator calc = new p01Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("5 - 2 = " + calc.subtract(5, 2));
    }
}
