
import java.io.*;

class P1 {
    public static void main(String[] args) {
        try {
            FileInputStream f_in = new FileInputStream("source.txt");
            FileOutputStream f_out = new FileOutputStream("destination.txt");
            int ch;
            while ((ch = f_in.read()) != -1) {
                f_out.write(ch);
            }
            f_in.close();
            f_out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
        }
    }
}
