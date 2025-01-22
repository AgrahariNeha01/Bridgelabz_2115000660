public class Pen {
    public static void main(String[] args) {
        int total_pen = 14;
        int total_student = 3;
        int pen_per_student = total_pen / total_student;
        int remainig_pen = total_pen % total_student;
        System.out.println("The Pen Per Student is " + pen_per_student + " and the remaining pen not distributed is "
                + remainig_pen);
    }
}
