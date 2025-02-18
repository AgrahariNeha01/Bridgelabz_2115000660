

abstract class Category {
    String name;
    Category(String name) { this.name = name; }
    public String toString() { return name; }
}

class BookCategory extends Category {
    BookCategory(String name) { super(name); }
}

class ClothingCategory extends Category {
    ClothingCategory(String name) { super(name); }
}

class GadgetCategory extends Category {
    GadgetCategory(String name) { super(name); }
}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void show() {
        System.out.println(name + " - " + category + " - $" + price);
    }
}

class Marketplace {
    static <T extends Product<?>> void applyDiscount(T p, double per) {
        p.price -= p.price * (per / 100);
    }
}

public class P2 {
    public static void main(String[] args) {
        Product<BookCategory> b1 = new Product<>("Java Programming", 50, new BookCategory("Educational"));
        Product<ClothingCategory> c1 = new Product<>("T-Shirt", 20, new ClothingCategory("Casual"));
        Product<GadgetCategory> g1 = new Product<>("Smartwatch", 150, new GadgetCategory("Wearable"));

        System.out.println("Before Discount:");
        b1.show();
        c1.show();
        g1.show();

        Marketplace.applyDiscount(b1, 10);
        Marketplace.applyDiscount(c1, 20);
        Marketplace.applyDiscount(g1, 15);

        System.out.println("\nAfter Discount:");
        b1.show();
        c1.show();
        g1.show();
    }
}
