import java.util.*;

class Task {
    int t_ID, prty;
    String t_Name, d_Date;
    Task nxt;

    Task(int t_ID, String t_Name, int prty, String d_Date) {
        this.t_ID = t_ID;
        this.t_Name = t_Name;
        this.prty = prty;
        this.d_Date = d_Date;
        this.nxt = null;
    }
}

class TaskList {
    Task head, tail, curr;

    void add_Beg(int t_ID, String t_Name, int prty, String d_Date) {
        Task t = new Task(t_ID, t_Name, prty, d_Date);
        if (head == null) {
            head = tail = curr = t;
            tail.nxt = head;
        } else {
            t.nxt = head;
            head = t;
            tail.nxt = head;
        }
    }

    void add_End(int t_ID, String t_Name, int prty, String d_Date) {
        Task t = new Task(t_ID, t_Name, prty, d_Date);
        if (head == null) {
            head = tail = curr = t;
            tail.nxt = head;
        } else {
            tail.nxt = t;
            tail = t;
            tail.nxt = head;
        }
    }

    void add_Pos(int t_ID, String t_Name, int prty, String d_Date, int pos) {
        if (pos == 1) {
            add_Beg(t_ID, t_Name, prty, d_Date);
            return;
        }
        Task t = new Task(t_ID, t_Name, prty, d_Date);
        Task tmp = head;
        for (int i = 1; tmp.nxt != head && i < pos - 1; i++) tmp = tmp.nxt;
        t.nxt = tmp.nxt;
        tmp.nxt = t;
        if (t.nxt == head) tail = t;
    }

    void del(int t_ID) {
        if (head == null) return;
        if (head.t_ID == t_ID) {
            if (head == tail) {
                head = tail = curr = null;
            } else {
                head = head.nxt;
                tail.nxt = head;
            }
            return;
        }
        Task tmp = head, prev = null;
        do {
            if (tmp.t_ID == t_ID) {
                prev.nxt = tmp.nxt;
                if (tmp == tail) tail = prev;
                return;
            }
            prev = tmp;
            tmp = tmp.nxt;
        } while (tmp != head);
    }

    void view_Curr() {
        if (curr != null) System.out.println(curr.t_ID + " | " + curr.t_Name + " | P: " + curr.prty + " | " + curr.d_Date);
    }

    void nxtTask() {
        if (curr != null) curr = curr.nxt;
    }

    void display() {
        if (head == null) return;
        Task tmp = head;
        do {
            System.out.println(tmp.t_ID + " | " + tmp.t_Name + " | P: " + tmp.prty + " | " + tmp.d_Date);
            tmp = tmp.nxt;
        } while (tmp != head);
    }

    void searchByprty(int prty) {
        Task tmp = head;
        do {
            if (tmp.prty == prty)
                System.out.println(tmp.t_ID + " | " + tmp.t_Name + " | " + tmp.d_Date);
            tmp = tmp.nxt;
        } while (tmp != head);
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskList tsk = new TaskList();

        tsk.add_End(1, "Proj", 2, "10-Feb");
        tsk.add_Beg(2, "Report", 1, "12-Feb");
        tsk.add_Pos(3, "Code", 3, "15-Feb", 2);
        tsk.add_End(4, "Review", 2, "18-Feb");

        tsk.display();
        tsk.view_Curr();
        tsk.nxtTask();
        tsk.view_Curr();
        tsk.del(2);
        tsk.display();
        tsk.searchByprty(2);

        sc.close();
    }
}
