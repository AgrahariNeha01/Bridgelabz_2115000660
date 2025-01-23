import java.util.*;

public class P29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        int yrs = sc.nextInt();

        if (yrs > 5) {
            double bonus = sal * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus for employees with less than or equal to 5 years of service.");
        }

        sc.close();
    }
}
