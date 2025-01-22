import java.util.Scanner;

public class P11{
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get the principal, rate, and time from the user
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();
        
        // Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display the results
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + ", Rate of Interest " + rate + 
                           " and Time " + time);
        
        sc.close();
    }
}
