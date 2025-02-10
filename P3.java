import java.util.*;

abstract class Vehicle {
    private String vNo, type;
    private double rRate;

    public Vehicle(String vNo, String type, double rRate) {
        this.vNo = vNo;
        this.type = type;
        this.rRate = rRate;
    }

    public String getVNo() {
        return vNo;
    }

    public String getType() {
        return type;
    }

    public double getRRate() {
        return rRate;
    }

    public abstract double calcRental(int days);
}

interface Insurable {
    double calcIns();
    String getInsDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String vNo, double rRate) {
        super(vNo, "Car", rRate);
    }

    public double calcRental(int days) {
        return getRRate() * days;
    }

    public double calcIns() {
        return 5000;
    }

    public String getInsDetails() {
        return "Comprehensive Car Insurance";
    }
}

class Bike extends Vehicle {
    public Bike(String vNo, double rRate) {
        super(vNo, "Bike", rRate);
    }

    public double calcRental(int days) {
        return getRRate() * days;
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vNo, double rRate) {
        super(vNo, "Truck", rRate);
    }

    public double calcRental(int days) {
        return getRRate() * days + 1000;
    }

    public double calcIns() {
        return 8000;
    }

    public String getInsDetails() {
        return "Heavy Vehicle Insurance";
    }
}

public class P3 {
    public static void main(String[] args) {
        List<Vehicle> vList = new ArrayList<>();
        vList.add(new Car("C123", 1500));
        vList.add(new Bike("B456", 500));
        vList.add(new Truck("T789", 3000));

        for (Vehicle v : vList) {
            double rCost = v.calcRental(5);
            double insCost = (v instanceof Insurable) ? ((Insurable) v).calcIns() : 0;
            System.out.println("Vehicle: " + v.getType() + ", Rental: " + rCost + ", Insurance: " + insCost);
        }
    }
}
