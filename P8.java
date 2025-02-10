import java.util.*;

abstract class Vehicle {
    private int vId;
    private String dName;
    private double rKm;

    Vehicle(int vId, String dName, double rKm) {
        this.vId = vId;
        this.dName = dName;
        this.rKm = rKm;
    }

    abstract double calcFare(double dist);

    void getVDetails() {
        System.out.println("ID: " + vId + ", Driver: " + dName + ", Rate/km: " + rKm);
    }
}

interface GPS {
    void getLoc();
    void updLoc(String newLoc);
}

class Car extends Vehicle implements GPS {
    private String loc;

    Car(int vId, String dName, double rKm, String loc) {
        super(vId, dName, rKm);
        this.loc = loc;
    }

    public double calcFare(double dist) {
        return dist * 12;
    }

    public void getLoc() {
        System.out.println("Current Location: " + loc);
    }

    public void updLoc(String newLoc) {
        loc = newLoc;
        System.out.println("Updated Location: " + loc);
    }
}

class Bike extends Vehicle implements GPS {
    private String loc;

    Bike(int vId, String dName, double rKm, String loc) {
        super(vId, dName, rKm);
        this.loc = loc;
    }

    public double calcFare(double dist) {
        return dist * 8;
    }

    public void getLoc() {
        System.out.println("Current Location: " + loc);
    }

    public void updLoc(String newLoc) {
        loc = newLoc;
        System.out.println("Updated Location: " + loc);
    }
}

class Auto extends Vehicle implements GPS {
    private String loc;

    Auto(int vId, String dName, double rKm, String loc) {
        super(vId, dName, rKm);
        this.loc = loc;
    }

    public double calcFare(double dist) {
        return dist * 10;
    }

    public void getLoc() {
        System.out.println("Current Location: " + loc);
    }

    public void updLoc(String newLoc) {
        loc = newLoc;
        System.out.println("Updated Location: " + loc);
    }
}

public class P8 {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car(101, "Neha", 12, "Sector 5"));
        rides.add(new Bike(102, "Sanju", 8, "Sector 8"));
        rides.add(new Auto(103, "Om", 10, "Sector 12"));

        for (Vehicle v : rides) {
            v.getVDetails();
            System.out.println("Fare for 10km: " + v.calcFare(10));
            if (v instanceof GPS) {
                GPS g = (GPS) v;
                g.getLoc();
                g.updLoc("Sector 15");
            }
            System.out.println();
        }
    }
}
