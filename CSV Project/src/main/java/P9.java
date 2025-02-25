import com.opencsv.*;
import java.io.*;
import java.util.*;

class Student {
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + age + " - " + marks;
    }
}

public class P9 {
    public static void main(String[] args) throws Exception {
        String filePath = "src/main/resources/students.csv";
        List<Student> students = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();
            String[] line;
            while ((line = reader.readNext()) != null) {
                students.add(new Student(line[0], Integer.parseInt(line[1]), Double.parseDouble(line[2])));
            }
        }

        for (Student s : students) System.out.println(s);
    }
}
