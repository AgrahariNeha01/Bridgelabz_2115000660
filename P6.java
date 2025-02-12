import java.util.*;

class Process {
    int id, bt, pr;
    Process nxt;

    Process(int id, int bt, int pr) {
        this.id = id;
        this.bt = bt;
        this.pr = pr;
        this.nxt = null;
    }
}

class Scheduler {
    Process head = null, tail = null;

    void addEnd(int id, int bt, int pr) {
        Process p = new Process(id, bt, pr);
        if (head == null) {
            head = tail = p;
            tail.nxt = head;
        } else {
            tail.nxt = p;
            tail = p;
            tail.nxt = head;
        }
    }

    void remove(int id) {
        if (head == null) return;
        Process tmp = head, prev = tail;
        do {
            if (tmp.id == id) {
                if (tmp == head) head = head.nxt;
                if (tmp == tail) tail = prev;
                prev.nxt = tmp.nxt;
                if (head == tail && head.id == id) head = tail = null;
                return;
            }
            prev = tmp;
            tmp = tmp.nxt;
        } while (tmp != head);
    }

    void roundRobin(int q) {
        if (head == null) return;
        int total = 0, wait = 0, t_time = 0, n = 0;
        Process cur = head;
        Map<Integer, Integer> wt = new HashMap<>(), tat = new HashMap<>();

        while (true) {
            boolean done = true;
            Process tmp = cur;
            do {
                if (tmp.bt > 0) {
                    done = false;
                    int exec = Math.min(q, tmp.bt);
                    tmp.bt -= exec;
                    total += exec;

                    if (tmp.bt == 0) {
                        tat.put(tmp.id, total);
                        wt.put(tmp.id, tat.get(tmp.id) - tmp.pr);
                        wait += wt.get(tmp.id);
                        t_time += tat.get(tmp.id);
                        remove(tmp.id);
                    }
                }
                tmp = tmp.nxt;
            } while (tmp != cur);

            if (done) break;
        }


        System.out.println(" Avg Waiting Time: " + (wait * 1.0 / n));
        System.out.println(" Avg Turnaround Time: " + (t_time * 1.0 / n));
    }

    void display() {
        if (head == null) {
            return;
        }
        Process tmp = head;
        do {
            System.out.println("ID: " + tmp.id + " | BT: " + tmp.bt + " | P: " + tmp.pr);
            tmp = tmp.nxt;
        } while (tmp != head);
    }
}

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scheduler sch = new Scheduler();

        sch.addEnd(1, 10, 3);
        sch.addEnd(2, 5, 1);
        sch.addEnd(3, 8, 2);
        sch.display();
        sch.roundRobin(4);

        sch.display();
    }
}
