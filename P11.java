

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSp;
    String model;

    Vehicle(int maxSp, String model) {
        this.maxSp = maxSp;
        this.model = model;
    }

    void display() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSp + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int battery;

    ElectricVehicle(int maxSp, String model, int battery) {
        super(maxSp, model);
        this.battery = battery;
    }

    void charge() {
        System.out.println(model + " is charging. Battery: " + battery + "%");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuel;

    PetrolVehicle(int maxSp, String model, int fuel) {
        super(maxSp, model);
        this.fuel = fuel;
    }

    public void refuel() {
        System.out.println(model + " is refueling. Fuel: " + fuel + "L");
    }
}

class P11 {
    public static void main(String[] args) {
        ElectricVehicle eV = new ElectricVehicle(150, "NeonE-Car", 80);
        PetrolVehicle pV = new PetrolVehicle(180, "SanjuSportsCar", 40);

        eV.display();
        eV.charge();
        pV.display();
        pV.refuel();
    }
}
