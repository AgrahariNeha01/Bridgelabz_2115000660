import java.io.*;
import java.sql.*;
import com.opencsv.CSVWriter;

public class P13 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root", pass = "password";
        String file = "src/main/resources/employees.csv";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement s = con.createStatement();
             ResultSet rs = s.executeQuery("SELECT * FROM employees");
             CSVWriter w = new CSVWriter(new FileWriter(file))) {

            w.writeNext(new String[]{"Employee ID", "Name", "Department", "Salary"});
            while (rs.next()) {
                w.writeNext(new String[]{
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getString("salary")
                });
            }
        }
        System.out.println("CSV file created.");
    }
}
