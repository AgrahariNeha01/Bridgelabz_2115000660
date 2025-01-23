import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nehaWeight = sc.nextDouble();
        double nehaHeightCm = sc.nextDouble();

        double nehaHeightM = nehaHeightCm / 100.0;
        double nehaBMI = nehaWeight / (nehaHeightM * nehaHeightM);

        if (nehaBMI <= 18.4) {
            System.out.println("Underweight");
        } else if (nehaBMI <= 24.9) {
            System.out.println("Normal");
        } else if (nehaBMI <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        sc.close();
    }
}
