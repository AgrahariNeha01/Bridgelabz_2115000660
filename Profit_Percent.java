public class Profit_Percent {
    public static void main(String[] args) {
        int SP = 191;
        int CP = 129;
        double profit = SP - CP;
        double profit_percent = (profit * 100) / CP;
        System.out.println("The Cost Price is INR 129 and Selling Price is INR 191\r\n" +
                "The Profit is INR" + profit + " and the Profit Percentage is " + profit_percent);

    }
}
