import java.util.*;
public class Total_Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitPrice=sc.nextInt();
        int quantity=sc.nextInt();
        int total_Price=unitPrice*quantity;
        System.out.println("The total purchase price is INR "+total_Price+" if the quantity "+quantity+" and unit price is INR " + unitPrice
                        );
                        sc.close();
    }
    
}
