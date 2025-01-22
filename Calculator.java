import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking two float inputs from user
        System.out.print("Enter first number: ");
        float n1 = sc.nextFloat();
        
        System.out.print("Enter second number: ");
        float n2 = sc.nextFloat();

        // Displaying results of operations
        System.out.println("Addition: " + Addition(n1, n2) + System.lineSeparator() +
                           "Subtraction: " + Subtraction(n1, n2) + System.lineSeparator() +
                           "Multiplication: " + Multiplication(n1, n2));

        float divisionResult = Division(n1, n2);
        
        if (divisionResult == Float.MIN_VALUE) {
            System.out.println("Division: Can't divide by zero");
        } else {
            System.out.println("Division: " + divisionResult);
        }

        sc.close(); // Closing scanner to prevent resource leaks
    }

    public static float Addition(float n1, float n2) {
        return n1 + n2;
    }

    public static float Subtraction(float n1, float n2) {
        return Math.abs(n1 - n2);  // Returns absolute difference
    }

    public static float Multiplication(float n1, float n2) {
        return n1 * n2;
    }

    public static float Division(float n1, float n2) {
        if (n2 == 0 || n1 == 0) {
            return Float.MIN_VALUE;  // Return minimum value to indicate division by zero
        }
        return (n1 > n2) ? n1 / n2 : n2 / n1;
    }
}
