import java.util.*;

public class AOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for height and base of the triangle in centimeters
        System.out.print("Enter height in cm: ");
        float height = sc.nextFloat();
        
        System.out.print("Enter base in cm: ");
        float base = sc.nextFloat();

        // Converting height and base from cm to inches (1 inch = 2.54 cm)
        float height_inches = height * (100f / 254);  // Corrected conversion
        float base_inches = base * (100f / 254);      // Corrected conversion

        // Calculating the area of the triangle using the correct formula
        float area_inches = (0.5f) * base_inches * height_inches;  // Fixed division issue
        float area_cm = (0.5f) * base * height;                    // Area in cm²

        // Printing the calculated areas with proper spacing
        System.out.println("Area of triangle in inches: " + area_inches);
        System.out.println("Area of triangle in cm: " + area_cm);

        sc.close();  // Closing scanner to prevent resource leaks
    }
}
