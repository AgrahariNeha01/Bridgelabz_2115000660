import java.util.*;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int maxD = 10;
        int[] d = new int[maxD];
        int idx = 0;
        
        while (n > 0) {
            d[idx] = n % 10;
            n = n / 10;
            idx++;
            
            if (idx == maxD) {
                maxD += 10;
                int[] temp = new int[maxD];
                
                for (int i = 0; i < d.length; i++) {
                    temp[i] = d[i];
                }
                
                d = temp;
            }
        }
        
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < idx; i++) {
            if (d[i] > largest) {
                secondLargest = largest;
                largest = d[i];
            } else if (d[i] > secondLargest && d[i] < largest) {
                secondLargest = d[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second-largest digit: " + secondLargest);
    }
}
