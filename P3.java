import java.io.*;

class P3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("userinfo.txt")) {

            System.out.print("Name: ");
            String name = br.readLine();

            System.out.print("Age: ");
            String age = br.readLine();

            System.out.print("Favorite Language: ");
            String lang = br.readLine();

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + lang + "\n");

            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
