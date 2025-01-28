public class P6 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean is_Spring = check_Spring(m, d);
        if (is_Spring) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }

    static boolean check_Spring(int m, int d) {
        if (m > 3 || (m == 3 && d >= 20)) {
            if (m < 6 || (m == 6 && d <= 20)) {
                return true;
            }
        }
        return false;
    }
}

