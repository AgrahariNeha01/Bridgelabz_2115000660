import java.io.*;

class P2 {
    public static void main(String[] args) {
        String src = "largefile.txt";
        String dest1 = "copy_unbuffered.txt";
        String dest2 = "copy_buffered.txt";

        // Unbuffered Copy
        long start1 = System.nanoTime();
        copyUnbuffered(src, dest1);
        long end1 = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end1 - start1) / 1e6 + " ms");

        // Buffered Copy
        long start2 = System.nanoTime();
        copyBuffered(src, dest2);
        long end2 = System.nanoTime();
        System.out.println("Buffered Time: " + (end2 - start2) / 1e6 + " ms");
    }

    static void copyUnbuffered(String src, String dest) {
        try (FileInputStream f_in = new FileInputStream(src);
             FileOutputStream f_out = new FileOutputStream(dest)) {
            int ch;
            while ((ch = f_in.read()) != -1) {
                f_out.write(ch);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void copyBuffered(String src, String dest) {
        try (BufferedInputStream b_in = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream b_out = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buf = new byte[4096];
            int len;
            while ((len = b_in.read(buf)) != -1) {
                b_out.write(buf, 0, len);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
