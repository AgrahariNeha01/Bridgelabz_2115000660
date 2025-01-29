import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d1In = sc.nextLine();
        String d2In = sc.nextLine();
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d1 = LocalDate.parse(d1In, f);
        LocalDate d2 = LocalDate.parse(d2In, f);

        if (d1.isBefore(d2)) {
            System.out.println("First date is before the second date.");
        } else if (d1.isAfter(d2)) {
            System.out.println("First date is after the second date.");
        } else if (d1.isEqual(d2)) {
            System.out.println("Both dates are the same.");
        }
    }
}
