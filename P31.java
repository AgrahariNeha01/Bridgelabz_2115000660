import java.util.*;

public class P31 {
    public static void main(String[] args) {
        int[] otps = new int[10];
        
        for (int i = 0; i < 10; i++) {
            otps[i] = genOTP();
        }

        boolean u = areUnique(otps);
        System.out.println("All OTPs are unique: " + u);
    }

    public static int genOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
}