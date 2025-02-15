import java.io.*;
import java.util.*;

class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next(); 

        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); 
                for (String word : words) {
                    if (word.equals(target)) {
                        count++;
                    }
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(count);
    }
}
