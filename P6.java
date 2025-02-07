
class Order {
    int o_id;
    String o_dt;

    Order(int o_id, String o_dt) {
        this.o_id = o_id;
        this.o_dt = o_dt;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String t_no;

    ShippedOrder(int o_id, String o_dt, String t_no) {
        super(o_id, o_dt);
        this.t_no = t_no;
    }

    String getOrderStatus() {
        return "Order Shipped, Tracking No: " + t_no;
    }
}

class DeliveredOrder extends ShippedOrder {
    String d_dt;

    DeliveredOrder(int o_id, String o_dt, String t_no, String d_dt) {
        super(o_id, o_dt, t_no);
        this.d_dt = d_dt;
    }

    String getOrderStatus() {
        return "Order Delivered on " + d_dt;
    }
}

class P6 {
    public static void main(String[] args) {
        DeliveredOrder o = new DeliveredOrder(12345, "2025-02-07", "TRK987654", "2025-02-10");
        System.out.println("Order ID: " + o.o_id + ", Date: " + o.o_dt);
        System.out.println(o.getOrderStatus());
    }
}
