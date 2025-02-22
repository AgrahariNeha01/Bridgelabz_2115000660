
import java.util.regex.*;

class P10 {
    static boolean isValidIP(String ip) {
        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                     + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                     + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                     + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {
        String[] testIPs = { "192.168.1.1", "255.255.255.255", "256.100.50.25", "1.2.3", "123.045.067.089" };

        for (String ip : testIPs) {
            System.out.println(ip + " -> " + (isValidIP(ip) ? "Valid" : "Invalid"));
        }
    }
}



