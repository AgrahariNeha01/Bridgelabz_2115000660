import java.util.*;

class P35 {
    public static void main(String[] args) {
        int[][] eData = new int[10][2];
        double[][] uData = new double[10][3];
        double totOld = 0, totNew = 0, totBonus = 0;

        getData(eData);
        uData = calcBonus(eData);

        for (int i = 0; i < 10; i++) {
            totOld += eData[i][0];
            totNew += uData[i][0];
            totBonus += uData[i][1];
        }

        System.out.println("Emp Data:");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Emp", "Old Sal", "Years", "New Sal", "Bonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-10d%-10d%-10.2f%-10.2f\n", i + 1, eData[i][0], eData[i][1], uData[i][0], uData[i][1]);
        }

        System.out.printf("\nTot Old Sal: %.2f\nTot New Sal: %.2f\nTot Bonus: %.2f\n", totOld, totNew, totBonus);
    }

    public static void getData(int[][] eData) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            eData[i][0] = 10000 + r.nextInt(90000);
            eData[i][1] = r.nextInt(20);
        }
    }

    public static double[][] calcBonus(int[][] eData) {
        double[][] uData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double b = eData[i][1] > 5 ? 0.05 * eData[i][0] : 0.02 * eData[i][0];
            uData[i][0] = eData[i][0] + b;
            uData[i][1] = b;
            uData[i][2] = eData[i][1];
        }
        return uData;
    }
}

