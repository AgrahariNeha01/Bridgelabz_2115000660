import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        int M1 = sc.nextInt();
        String S2 = sc.next();
        int M2 = sc.nextInt();
        String S3 = sc.next();
        int M3 = sc.nextInt();
        int total = M1 + M2 + M3;
        double percent = (double)(total / 3) * 100;
        double avg = total / 3;
        
        if (percent >= 80.0) {
            System.out.println("Average marks: " + avg + ",\nGrade: A" + 
                               " \nRemarks: Level 4, above agency-normalized standards");
        } 
        else if (percent < 80.0 && percent >= 70.0) {
            System.out.println("Average marks: " + avg + ",\nGrade: B" + 
                               " \nRemarks: Level 3, at agency-normalized standards");
        } 
        else if (percent < 70.0 && percent >= 60.0) {
            System.out.println("Average marks: " + avg + ",\nGrade: C" + 
                               " \nRemarks: Level 2, below agency-normalized standards");
        } 
        else if (percent < 60.0 && percent >= 50.0) {
            System.out.println("Average marks: " + avg + ",\nGrade: D" + 
                               " \nRemarks: Level 1, well below agency-normalized standards");
        } 
        else if (percent < 50.0 && percent >= 40.0) {
            System.out.println("Average marks: " + avg + ",\nGrade: E" + 
                               " \nRemarks: Level 1, too below agency-normalized standards");
        } 
        else {
            System.out.println("Average marks: " + avg + " \nRemedial standards");
        }
    }
}
