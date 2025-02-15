import java.io.*;

class P5 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Neha.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
