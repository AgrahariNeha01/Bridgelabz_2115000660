import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    JSONObject toJSON() {
        JSONObject obj = new JSONObject();
        obj.put("brand", brand);
        obj.put("year", year);
        return obj;
    }
}

public class ListToJSONArray2 {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Toyota", 2020));
        list.add(new Vehicle("Honda", 2019));
        list.add(new Vehicle("Ford", 2021));

        JSONArray arr = new JSONArray();
        for (Vehicle v : list) {
            arr.put(v.toJSON());
        }

        System.out.println(arr);
    }
}
