import java.io.*;

class P5 {
    public static void main(String[] args) {
        String src = "input.jpg";
        String dest = "output.jpg";

        try (FileInputStream f_in = new FileInputStream(src);
             ByteArrayOutputStream b_out = new ByteArrayOutputStream()) {

            byte[] buf = new byte[4096];
            int len;
            while ((len = f_in.read(buf)) != -1) {
                b_out.write(buf, 0, len);
            }

            byte[] imgData = b_out.toByteArray(); // Image as byte array

            try (ByteArrayInputStream b_in = new ByteArrayInputStream(imgData);
                 FileOutputStream f_out = new FileOutputStream(dest)) {

                while ((len = b_in.read(buf)) != -1) {
                    f_out.write(buf, 0, len);
                }
                System.out.println("Image copied successfully.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
