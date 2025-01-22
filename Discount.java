public class Discount {
    public static void main(String[] args) {
        int Total_fee = 125000;
        int Discount_percent = 10;
        float Discount_amount = (Total_fee * Discount_percent) / 100;
        float Discount_price = (float) Total_fee - Discount_amount;
        System.out.println(
                "The discount amount is INR " + Discount_amount + " and final discounted fee is INR " + Discount_price);

    }
}
