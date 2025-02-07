import java.util.*;

class Vehicle {
    int maxSpd;
    String fuel;

    Vehicle(int maxSpd, String fuel) {
        this.maxSpd = maxSpd;
        this.fuel = fuel;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpd + " km/h, Fuel Type: " + fuel);
    }
}

class Car extends Vehicle {
    int s_cap;

    Car(int maxSpd, String fuel, int s_cap) {
        super(maxSpd, fuel);
        this.s_cap = s_cap;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpd + " km/h, Fuel: " + fuel + ", Seats: " + s_cap);
    }
}

class Truck extends Vehicle {
    int loadCap;

    Truck(int maxSpd, String fuel, int loadCap) {
        super(maxSpd, fuel);
        this.loadCap = loadCap;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpd + " km/h, Fuel: " + fuel + ", Load Capacity: " + loadCap + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(int maxSpd, String fuel, boolean hasGear) {
        super(maxSpd, fuel);
        this.hasGear = hasGear;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpd + " km/h, Fuel: " + fuel + ", Gear: " + (hasGear ? "Yes" : "No"));
    }
}

class P3 {
    public static void main(String[] args) {
        Vehicle[] v = {
            new Car(220, "Petrol", 5),
            new Truck(120, "Diesel", 10),
            new Motorcycle(180, "Petrol", true)
        };

        for (Vehicle x : v) {
            x.displayInfo();
        }
    }
}
