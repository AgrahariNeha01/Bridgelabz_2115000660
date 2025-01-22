import java.util.*;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 mile = 1760 yards and 1 yard is 3 feet
        double Distance_feet=sc.nextDouble();
        //1 feet= 1/3 yards and 1 yard = 1/1760 miles.
        double distance_yards=(1/3)*Distance_feet;
        double distance_miles=(1/1760)*distance_yards;
        System.out.println("Distance in feet "+Distance_feet+"Distance in miles "+distance_miles+"Distance in yards "+distance_yards);
        sc.close();

    }
    
}
