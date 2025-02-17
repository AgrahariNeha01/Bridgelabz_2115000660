import java.io.*;
import java.util.*;

public class P4 {
    static void testFileReader(String file) throws Exception {
        long s = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1);
        fr.close();
        long e = System.nanoTime();
        System.out.println("FileReader: " + (e - s) / 1_000_000 + " ms");
    }

    static void testInputStreamReader(String file) throws Exception {
        long s = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1);
        isr.close();
        long e = System.nanoTime();
        System.out.println("InputStreamReader: " + (e - s) / 1_000_000 + " ms");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String file = sc.next();
        
        testFileReader(file);
        testInputStreamReader(file);
    }
}
