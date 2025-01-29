import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter date (yyyy-MM-dd): ");
        String dIn = sc.nextLine();
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d = LocalDate.parse(dIn, f);
        
        LocalDate nD = d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Resulting date: " + nD.format(f));
    }
}
