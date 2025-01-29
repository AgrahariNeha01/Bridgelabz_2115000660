import java.time.*;
import java.time.format.DateTimeFormatter;

public class P10 {
    public static void main(String[] args) {
        ZonedDateTime g = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime i = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime p = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("GMT time: " + g.format(f));
        System.out.println("IST time: " + i.format(f));
        System.out.println("PST time: " + p.format(f));
    }
}
