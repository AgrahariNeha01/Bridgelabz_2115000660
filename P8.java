import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();
        
        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();
        
        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();
        
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();
        
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();
        
        System.out.print("Enter total time taken in hours: ");
        double timeTaken = sc.nextDouble();
        
        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / timeTaken;
        
        System.out.println("Hello " + name + ", you traveled from " + fromCity + " to " + toCity + 
                           " via " + viaCity + " covering a total distance of " + totalDistance + 
                           " miles at an average speed of " + speed + " miles per hour.");
        
        sc.close();
    }
}
