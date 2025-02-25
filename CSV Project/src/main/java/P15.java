import com.opencsv.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.*;
import java.util.Base64;

public class P15 {
    static SecretKey key = generateKey();

    public static SecretKey generateKey() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            return keyGen.generateKey();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
    }

    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
    }

    public static void writeCSV(String csvFile) throws Exception {
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
            writer.writeNext(new String[]{"ID", "Name", "Email", "Salary"});
            writer.writeNext(new String[]{"1", "Neha", encrypt("neha@gmail.com"), encrypt("50000")});
            writer.writeNext(new String[]{"2", "Rahul", encrypt("rahul@gmail.com"), encrypt("60000")});
        }
    }

    public static void readCSV(String csvFile) throws Exception {
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] row;
            while ((row = reader.readNext()) != null) {
                System.out.println(row[0] + ", " + row[1] + ", " + decrypt(row[2]) + ", " + decrypt(row[3]));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String csvFile = "employees.csv";
        writeCSV(csvFile);
        System.out.println("CSV Encrypted Successfully!\n");
        System.out.println("Decrypted CSV Data:");
        readCSV(csvFile);
    }
}
