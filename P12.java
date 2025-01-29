import java.time.*;
import java.time.format.DateTimeFormatter;

public class P12 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current date (dd/MM/yyyy): " + d.format(f1));
        System.out.println("Current date (yyyy-MM-dd): " + d.format(f2));
        System.out.println("Current date (EEE, MMM dd, yyyy): " + d.format(f3));
    }
}
