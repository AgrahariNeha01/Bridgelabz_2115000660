import org.json.JSONObject;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("brand", brand);
        json.put("model", model);
        json.put("year", year);
        return json;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2023);
        System.out.println(car.toJSON().toString(2));  // JSON format me print hoga
    }
}
