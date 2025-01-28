
import java.util.*;

public class P32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        prntCal(m, y);
    }

    public static void prntCal(int m, int y) {
        String mnth = getMnth(m);
        int numDys = getNumDys(m, y);
        int fstDy = getFstDy(m, y);

        System.out.println("\n" + mnth + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int d = 1;
        for (int i = 0; i < 7; i++) {
            if (i < fstDy) {
                System.out.print("   ");
            } else {
                System.out.printf("%3d", d++);
            }
        }

        System.out.println();

        for (int i = 1; d <= numDys; i++) {
            for (int j = 0; j < 7; j++) {
                if (d <= numDys) {
                    System.out.printf("%3d", d++);
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }

    public static String getMnth(int m) {
        String[] mnths = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return mnths[m - 1];
    }

    public static int getNumDys(int m, int y) {
        int[] dys = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (m == 2 && isLyr(y)) {
            return 29;
        }
        return dys[m - 1];
    }

    public static boolean isLyr(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getFstDy(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }
}


