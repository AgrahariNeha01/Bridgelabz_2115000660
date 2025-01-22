import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side1 in meters: ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter side2 in meters: ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter side3 in meters: ");
        double side3 = sc.nextDouble();
        
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000; // 5 km in meters
        
        int rounds = (int)Math.ceil(distanceToRun / perimeter);
        
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
        
        sc.close();
    }
}
