

class Circular_Tour {
    public static int find_Start(int[] petrol, int[] dist) {
        int n = petrol.length;
        int total = 0, curr = 0, start = 0;

        for (int i = 0; i < n; i++) {
            int gain = petrol[i] - dist[i];
            total += gain;
            curr += gain;

            if (curr < 0) { // Agar kahin pe petrol negative ho gaya, yahan tak travel nahi ho sakta
                start = i + 1;  // Naya starting point lo
                curr = 0;  // Reset current petrol
            }
        }
        return (total < 0) ? -1 : start;  // Agar total petrol < 0 to tour possible hi nahi
    }
}

public class P5 {
    public static void main(String[] args) {
        int[] petrol = {8, 6, 7, 4};
        int[] dist = {6, 5, 1, 5};

        int start = Circular_Tour.find_Start(petrol, dist);
        System.out.println(start);
    }
}
