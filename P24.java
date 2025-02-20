import java.util.*;

class P24 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 30);
        cart.addItem("Banana", 10);
        cart.addItem("Mango", 50);
        cart.addItem("Orange", 20);

        System.out.println("Product Prices: " + cart.getProductPrices());
        System.out.println("Added Order: " + cart.getAddedOrder());
        System.out.println("Sorted by Price: " + cart.getSortedByPrice());
    }
}

class ShoppingCart {
    Map<String, Integer> productPrices = new HashMap<>();
    LinkedHashMap<String, Integer> addedOrder = new LinkedHashMap<>();
    TreeMap<Integer, String> sortedByPrice = new TreeMap<>();

    void addItem(String item, int price) {
        productPrices.put(item, price);
        addedOrder.put(item, price);
        sortedByPrice.put(price, item);
    }

    Map<String, Integer> getProductPrices() {
        return productPrices;
    }

    Map<String, Integer> getAddedOrder() {
        return addedOrder;
    }

    Map<Integer, String> getSortedByPrice() {
        return sortedByPrice;
    }
}
