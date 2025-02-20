import java.util.*;
import java.io.*;

class P17 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        HashMap<String, Integer> map = new HashMap<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        br.close();
        System.out.println(map);
    }
}
