

class Ticket {
    int tID;
    String cust, movie, seat, time;
    Ticket nxt;

    Ticket(int tID, String cust, String movie, String seat, String time) {
        this.tID = tID;
        this.cust = cust;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
        this.nxt = null;
    }
}

class TicketSys {
    Ticket head = null, tail = null;
    int cnt = 0;

    void add(int tID, String cust, String movie, String seat, String time) {
        Ticket t = new Ticket(tID, cust, movie, seat, time);
        if (head == null) {
            head = tail = t;
            tail.nxt = head;
        } else {
            tail.nxt = t;
            t.nxt = head;
            tail = t;
        }
        cnt++;
    }

    void remove(int tID) {
        if (head == null) return;
        Ticket cur = head, prev = tail;
        do {
            if (cur.tID == tID) {
                if (cur == head) head = head.nxt;
                if (cur == tail) tail = prev;
                prev.nxt = cur.nxt;
                cnt--;
                return;
            }
            prev = cur;
            cur = cur.nxt;
        } while (cur != head);
    }

    void show() {
        if (head == null) {
            return;
        }
        Ticket t = head;
        do {
            System.out.println(t.tID + " | " + t.cust + " | " + t.movie + " | " + t.seat + " | " + t.time);
            t = t.nxt;
        } while (t != head);
    }

    void search(String key) {
        if (head == null) return;
        Ticket t = head;
        do {
            if (t.cust.equalsIgnoreCase(key) || t.movie.equalsIgnoreCase(key)) 
                System.out.println( t.tID + " | " + t.cust + " | " + t.movie + " | " + t.seat + " | " + t.time);
            t = t.nxt;
        } while (t != head);
    }

    int count() {
        return cnt;
    }
}

public class P9 {
    public static void main(String[] args) {
        TicketSys ts = new TicketSys();

        ts.add(101, "Neha", "Jawan", "A1", "10:00 AM");
        ts.add(102, "Bibbu", "Dunki", "B2", "1:00 PM");
        ts.add(103, "Raj", "Salaar", "C3", "4:00 PM");

        ts.show();

        System.out.println("\n Searching for 'Dunki':");
        ts.search("Dunki");

        ts.remove(102);
        System.out.println("\n After removing ticket 102:");
        ts.show();

        System.out.println("\nTotal Tickets: " + ts.count());
    }
}
