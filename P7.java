import java.util.*;

class Order {
    int o_id;
    List<Product> products = new ArrayList<>();
    double total;

    Order(int o_id) {
        this.o_id = o_id;
    }

    void addProduct(Product p) {
        products.add(p);
        total += p.price;
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + o_id);
        for (Product p : products) {
            System.out.println("Product: " + p.name + ", Price: " + p.price);
        }
        System.out.println("Total: " + total);
    }
}

class Customer {
    String c_name;
    List<Order> orders = new ArrayList<>();

    Customer(String c_name) {
        this.c_name = c_name;
    }

    void placeOrder(Order o) {
        orders.add(o);
    }

    void showCustomerOrders() {
        System.out.println("Orders placed by " + c_name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c_Name = sc.nextLine();
        Customer customer = new Customer(c_Name);

        System.out.print("Enter number of orders for " + c_Name+ ": ");
        int o_Count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < o_Count; i++) {
            int o_Id = sc.nextInt();
            sc.nextLine();
            Order order = new Order(o_Id);
            int p_Count = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < p_Count; j++) {
                String p_Name = sc.nextLine();
                double p_Price = sc.nextDouble();
                sc.nextLine();
                Product product = new Product(p_Name, p_Price);
                order.addProduct(product);
            }
            customer.placeOrder(order);
        }

        customer.showCustomerOrders();
        sc.close();
    }
}
