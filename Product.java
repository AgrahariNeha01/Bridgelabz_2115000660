import java.util.*;

public class Product {
    static double d;
    final String pID;
    String pN;
    double price;
    int qty;

    Product(String pN, double price, int qty, String pID) {
        this.pN = pN;
        this.price = price;
        this.qty = qty;
        this.pID = pID;
    }

    static void uD(double newD) {
        d = newD;
    }

    void pD() {
        if (this instanceof Product) {
            double total = price * qty;
            double d_price = total - (total * d / 100);
            System.out.println(pN + " " + pID + " " + total + " " + d_price);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        uD(sc.nextDouble());
        sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();
        Product[] p = new Product[n];

        for (int i = 0; i < p.length; i++) {
            String pN = sc.nextLine();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            sc.nextLine();
            String pID = sc.nextLine();

            p[i] = new Product(pN, price, qty, pID);
        }

        for (Product prd : p) {
            prd.pD();
        }
    }
}
