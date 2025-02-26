import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

import com.lcwd.test.Car;
public class ListToJSONArray {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2020));
        cars.add(new Car("Honda", 2019));
        cars.add(new Car("Ford", 2021));

        JSONArray jsonArray = new JSONArray();
        for (Car c : cars) {
            jsonArray.put(c.toJSON());
        }

        System.out.println(jsonArray);
    }
}
