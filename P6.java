import java.util.*;

abstract class FoodItem {
    private String name;
    private double price;
    private int qty;

    public FoodItem(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getItemDetails() {
        return "Item: " + name + ", Price: " + price + ", Qty: " + qty;
    }

    public abstract double calcTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calcTotalPrice() {
        return getPrice() * getQty();
    }

    public double applyDiscount() {
        return calcTotalPrice() * 0.1;
    }

    public String getDiscountDetails() {
        return "10% discount applied.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calcTotalPrice() {
        return (getPrice() * getQty()) + 50; // Extra charge for non-veg
    }

    public double applyDiscount() {
        return calcTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% discount applied.";
    }
}

public class P6 {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            double total = item.calcTotalPrice();
            System.out.println(item.getItemDetails() + ", Total Price: " + total);
            if (item instanceof Discountable) {
                Discountable dItem = (Discountable) item;
                System.out.println(dItem.getDiscountDetails() + " Discount: " + dItem.applyDiscount());
            }
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 350, 1));

        processOrder(order);
    }
}
