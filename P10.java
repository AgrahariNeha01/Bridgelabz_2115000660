import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get the number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        
        // Calculate the number of chocolates each child gets and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                           " and the number of remaining chocolates are " + remainingChocolates);
        
        sc.close();
    }
}
