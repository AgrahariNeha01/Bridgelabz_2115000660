import java.io.*;
import java.util.*;

class P9 {
    public static void main(String[] args) {
        compareStringBuilders();
        compareFileReaders();
    }

    static void compareStringBuilders() {
        String str = "hello";
        int times = 1_000_000;

        long start1 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sbf.append(str);
        }
        long end1 = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end1 - start1) / 1_000_000 + " ms");

        long start2 = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sbd.append(str);
        }
        long end2 = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end2 - start2) / 1_000_000 + " ms");
    }

    static void compareFileReaders() {
        String filename = "largefile.txt";
        long start1 = System.nanoTime();
        int words1 = countWordsUsingFileReader(filename);
        long end1 = System.nanoTime();
        System.out.println("FileReader Words: " + words1 + ", Time: " + (end1 - start1) / 1_000_000 + " ms");

        long start2 = System.nanoTime();
        int words2 = countWordsUsingInputStreamReader(filename);
        long end2 = System.nanoTime();
        System.out.println("InputStreamReader Words: " + words2 + ", Time: " + (end2 - start2) / 1_000_000 + " ms");
    }

    static int countWordsUsingFileReader(String filename) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }

    static int countWordsUsingInputStreamReader(String filename) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"));
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
}
