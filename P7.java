import java.io.*;

class P7 {
    public static void main(String[] args) {
        String file = "students.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(101);
            dos.writeUTF("Neha");
            dos.writeDouble(9.2);

            dos.writeInt(102);
            dos.writeUTF("Amit");
            dos.writeDouble(8.8);

            System.out.println("Student data saved.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

      
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println(roll + " " + name + " " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
