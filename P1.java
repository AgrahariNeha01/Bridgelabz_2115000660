import java.util.*;

class Student {
    int r_n;
    String name;
    int age;
    char grd;
    Student next;

    Student(int r_n, String name, int age, char grd) {
        this.r_n = r_n;
        this.name = name;
        this.age = age;
        this.grd = grd;
        this.next = null;
    }
}

class Student_list {
    Student head;

    void add_beg(int r_n, String name, int age, char grd) {
        Student new_st = new Student(r_n, name, age, grd);
        new_st.next = head;
        head = new_st;
    }

    void add_end(int r_n, String name, int age, char grd) {
        Student new_st = new Student(r_n, name, age, grd);
        if (head == null) {
            head = new_st;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_st;
    }

    void add_pos(int r_n, String name, int age, char grd, int pos) {
        if (pos == 1) {
            add_beg(r_n, name, age, grd);
            return;
        }
        Student new_st = new Student(r_n, name, age, grd);
        Student temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null) return;
        new_st.next = temp.next;
        temp.next = new_st;
    }

    void del(int r_n) {
        if (head == null) return;
        if (head.r_n == r_n) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.r_n != r_n) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    Student search(int r_n) {
        Student temp = head;
        while (temp != null) {
            if (temp.r_n == r_n) return temp;
            temp = temp.next;
        }
        return null;
    }

    void update_grd(int r_n, char grd) {
        Student s = search(r_n);
        if (s != null) s.grd = grd;
    }

    void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.r_n);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grd);
            System.out.println("--------------------");
            temp = temp.next;
        }
    }
}

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_list sl = new Student_list();  
        sl.add_end(1, "Neha", 20, 'A');
        sl.add_beg(2, "Sanju", 21, 'B');
        sl.add_pos(3, "Om", 22, 'C', 2);

        System.out.println("\nStudent Records:");
        sl.display();

        System.out.println("\nAfter Deletion:");
        sl.del(2);
        sl.display();

        System.out.println("\nAfter Update:");
        sl.update_grd(3, 'A');
        sl.display();

        sc.close();
    }
}
