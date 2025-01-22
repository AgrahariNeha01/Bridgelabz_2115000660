import java.util.*;
public class Discount_User_Input
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Total_fee = sc.nextInt();
        int Discount_percent = sc.nextInt();
        float Discount_amount = (Total_fee * Discount_percent) / 100;
        float Discount_price = (float) Total_fee - Discount_amount;
        System.out.println(
                "The discount amount is INR " + Discount_amount + " and final discounted fee is INR " + Discount_price);
                sc.close();

    }
}
