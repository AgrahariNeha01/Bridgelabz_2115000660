import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.*;

public class P35 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db";
        String user = "root";
        String pass = "password";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM records")) {

            JSONArray arr = new JSONArray();
            ResultSetMetaData meta = rs.getMetaData();
            int cols = meta.getColumnCount();

            while (rs.next()) {
                JSONObject obj = new JSONObject();
                for (int i = 1; i <= cols; i++) {
                    obj.put(meta.getColumnName(i), rs.getObject(i));
                }
                arr.put(obj);
            }

            System.out.println(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
