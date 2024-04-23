package java.projetcs.Calculator;
/*
Use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

Add two integers
Subtract two integers
Multiply two integers
Divide two integers
Apply the modulo operator on two integers
*/

//Class names Calculator 
public class Calculator {

    // COnstructor method
    public Calculator() {
    }

    // Add method
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide method
    public int divide(int a, int b) {
        return a / b;
    }

    // Modulo method
    public int modulo(int a, int b) {
        return a % b;
    }

    // Main method
    public static void main(String[] args) {

        // Create new Calculator object myCalculator
        Calculator myCalculator = new Calculator();

        // Print the value of calling add() method on myCalculator passing in values
        System.out.println(myCalculator.add(5, 7));

        // Print the value of calling add() method on myCalculator passing in values
        System.out.println(myCalculator.subtract(45, 11));
    }
}

// output 12 and 34

// All methods need to be within the Class parenthesis
