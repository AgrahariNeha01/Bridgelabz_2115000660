import java.util.*;

class Course {
    String c_n;
    int d;

    Course(String c_n, int d) {
        this.c_n = c_n;
        this.d = d;
    }

    void display() {
        System.out.println("Course: " + c_n + ", Duration: " + d + " weeks");
    }
}

class OnlineCourse extends Course {
    String p;
    boolean r;

    OnlineCourse(String c_n, int d, String p, boolean r) {
        super(c_n, d);
        this.p = p;
        this.r = r;
    }

    void display() {
        System.out.println("Course: " + c_n + ", Duration: " + d + " weeks, Platform: " + p + ", Recorded: " + (r ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    int f, dsc;

    PaidOnlineCourse(String c_n, int d, String p, boolean r, int f, int dsc) {
        super(c_n, d, p, r);
        this.f = f;
        this.dsc = dsc;
    }

    void display() {
        System.out.println("Course: " + c_n + ", Duration: " + d + " weeks, Platform: " + p + ", Recorded: " + (r ? "Yes" : "No") + 
                           ", Fee: ₹" + f + ", Discount: " + dsc + "%");
    }
}

class P7 {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("NeuralNova AI", 10, "SkillXpert", true, 7000, 25);
        c.display();
    }
}
