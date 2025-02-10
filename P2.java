import java.util.*;

abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calcDisc();
}

interface Taxable {
    double calcTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calcDisc() {
        return getPrice() * 0.10;
    }

    public double calcTax() {
        return getPrice() * 0.15;
    }

    public String getTaxDetails() {
        return "15% GST";
    }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calcDisc() {
        return getPrice() * 0.20;
    }
}

class Groceries extends Product implements Taxable {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calcDisc() {
        return getPrice() * 0.05;
    }

    public double calcTax() {
        return getPrice() * 0.02;
    }

    public String getTaxDetails() {
        return "2% VAT";
    }
}

public class P2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(201, "Laptop", 60000));
        products.add(new Clothing(202, "T-Shirt", 1200));
        products.add(new Groceries(203, "Rice", 800));

        for (Product p : products) {
            double disc = p.calcDisc();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calcTax() : 0;
            double finalPrice = p.getPrice() + tax - disc;
            System.out.println("Product: " + p.getName() + ", Final Price: " + finalPrice);
        }
    }
}
