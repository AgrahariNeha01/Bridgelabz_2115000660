

class Device {
    int d_id;
    String st;

    Device(int d_id, String st) {
        this.d_id = d_id;
        this.st = st;
    }

    void displayStatus() {
        System.out.println("Device ID: " + d_id + ", Status: " + st);
    }
}

class Thermostat extends Device {
    int temp;

    Thermostat(int d_id, String st, int temp) {
        super(d_id, st);
        this.temp = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + d_id + ", Status: " + st + ", Temp: " + temp + "°C");
    }
}

class P5 {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(101, "ON", 24);
        t.displayStatus();
    }
}
