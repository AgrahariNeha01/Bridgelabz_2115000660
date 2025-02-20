import java.util.*;

class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int idx = sc.nextInt();
        int div = sc.nextInt();

        try {
            int val = arr[idx];
            try {
                System.out.println(val / div);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
