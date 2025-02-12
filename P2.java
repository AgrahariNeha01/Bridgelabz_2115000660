import java.util.*;

class Movie {
    String title, drtr;
    int year;
    double rating;
    Movie next, prev;

    Movie(String title, String drtr, int year, double rating) {
        this.title = title;
        this.drtr = drtr;
        this.year = year;
        this.rating = rating;
        this.next = this.prev = null;
    }
}

class MovieList {
    Movie head, tail;

    void add_Beg(String title, String drtr, int year, double rating) {
        Movie newM = new Movie(title, drtr, year, rating);
        if (head == null) {
            head = tail = newM;
        } else {
            newM.next = head;
            head.prev = newM;
            head = newM;
        }
    }

    void add_End(String title, String drtr, int year, double rating) {
        Movie newM = new Movie(title, drtr, year, rating);
        if (head == null) {
            head = tail = newM;
        } else {
            tail.next = newM;
            newM.prev = tail;
            tail = newM;
        }
    }

    void add_Pos(String title, String drtr, int year, double rating, int pos) {
        if (pos == 1) {
            add_Beg(title, drtr, year, rating);
            return;
        }
        Movie newM = new Movie(title, drtr, year, rating);
        Movie temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            add_End(title, drtr, year, rating);
            return;
        }
        newM.next = temp.next;
        newM.prev = temp;
        temp.next.prev = newM;
        temp.next = newM;
    }

    void del(String title) {
        if (head == null) return;
        if (head.title.equals(title)) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return;
        }
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) temp = temp.next;
        if (temp == null) return;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp == tail) tail = temp.prev;
    }

    void searchBydrtr(String drtr) {
        Movie temp = head;
        while (temp != null) {
            if (temp.drtr.equals(drtr))
                System.out.println(temp.title + " (" + temp.year + ") - Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating)
                System.out.println(temp.title + " (" + temp.year + ") - drtr: " + temp.drtr);
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.drtr + " | " + temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.drtr + " | " + temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieList ml = new MovieList();

        ml.add_End("Inception", "Christopher Nolan", 2010, 8.8);
        ml.add_Beg("Titanic", "James Cameron", 1997, 7.8);
        ml.add_Pos("Avengers", "Joss Whedon", 2012, 8.0, 2);
        ml.add_End("Interstellar", "Christopher Nolan", 2014, 8.6);
        ml.displayForward();
        ml.displayReverse();
        ml.del("Titanic");
        ml.displayForward();
        ml.updateRating("Avengers", 9.0);
        ml.displayForward();
        ml.searchBydrtr("Christopher Nolan");
        ml.searchByRating(8.6);

        sc.close();
    }
}
