import java.util.*;

abstract class Patient {
    private int pId;
    private String name;
    private int age;

    Patient(int pId, String name, int age) {
        this.pId = pId;
        this.name = name;
        this.age = age;
    }

    abstract double calcBill();

    void getPDetails() {
        System.out.println("ID: " + pId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int days;
    private double costPerDay;
    private List<String> records = new ArrayList<>();

    InPatient(int pId, String name, int age, int days, double costPerDay) {
        super(pId, name, age);
        this.days = days;
        this.costPerDay = costPerDay;
    }

    public double calcBill() {
        return days * costPerDay;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    OutPatient(int pId, String name, int age, double consultationFee) {
        super(pId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calcBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

public class P7 {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(101, "Rahul", 30, 5, 2000));
        patients.add(new OutPatient(102, "Neha", 25, 500));

        for (Patient p : patients) {
            p.getPDetails();
            System.out.println("Total Bill: " + p.calcBill());
            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                mr.addRecord("Initial Checkup Done");
                mr.viewRecords();
            }
            System.out.println();
        }
    }
}
