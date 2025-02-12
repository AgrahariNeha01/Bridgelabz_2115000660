import java.util.*;

class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book nxt, prev;

    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.nxt = this.prev = null;
    }
}

class Library {
    Book head, tail;
    int count = 0;

    void add_Beg(int id, String title, String author, String genre, boolean available) {
        Book b = new Book(id, title, author, genre, available);
        if (head == null) {
            head = tail = b;
        } else {
            b.nxt = head;
            head.prev = b;
            head = b;
        }
        count++;
    }

    void add_End(int id, String title, String author, String genre, boolean available) {
        Book b = new Book(id, title, author, genre, available);
        if (head == null) {
            head = tail = b;
        } else {
            tail.nxt = b;
            b.prev = tail;
            tail = b;
        }
        count++;
    }

    void add_Pos(int id, String title, String author, String genre, boolean available, int pos) {
        if (pos <= 1) {
            add_Beg(id, title, author, genre, available);
            return;
        }
        Book b = new Book(id, title, author, genre, available), tmp = head;
        for (int i = 1; tmp != null && i < pos - 1; i++) tmp = tmp.nxt;
        if (tmp == null || tmp.nxt == null) {
            add_End(id, title, author, genre, available);
            return;
        }
        b.nxt = tmp.nxt;
        tmp.nxt.prev = b;
        tmp.nxt = b;
        b.prev = tmp;
        count++;
    }

    void del(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.nxt;
            if (head != null) head.prev = null;
            else tail = null;
            count--;
            return;
        }
        Book tmp = head;
        while (tmp != null && tmp.id != id) tmp = tmp.nxt;
        if (tmp == null) return;
        if (tmp.nxt != null) tmp.nxt.prev = tmp.prev;
        if (tmp.prev != null) tmp.prev.nxt = tmp.nxt;
        if (tmp == tail) tail = tmp.prev;
        count--;
    }

    void update_Status(int id, boolean available) {
        Book tmp = head;
        while (tmp != null) {
            if (tmp.id == id) {
                tmp.available = available;
                return;
            }
            tmp = tmp.nxt;
        }
    }

    void searchByTitle(String title) {
        Book tmp = head;
        while (tmp != null) {
            if (tmp.title.equalsIgnoreCase(title)) {
                System.out.println(tmp.id + " | " + tmp.title + " | " + tmp.author + " | " + tmp.genre + " | " + (tmp.available ? "Available" : "Not Available"));
            }
            tmp = tmp.nxt;
        }
    }

    void searchByAuthor(String author) {
        Book tmp = head;
        while (tmp != null) {
            if (tmp.author.equalsIgnoreCase(author)) {
                System.out.println(tmp.id + " | " + tmp.title + " | " + tmp.author + " | " + tmp.genre + " | " + (tmp.available ? "Available" : "Not Available"));
            }
            tmp = tmp.nxt;
        }
    }

    void displayFwd() {
        Book tmp = head;
        while (tmp != null) {
            System.out.println(tmp.id + " | " + tmp.title + " | " + tmp.author + " | " + tmp.genre + " | " + (tmp.available ? "Available" : "Not Available"));
            tmp = tmp.nxt;
        }
    }

    void displayRev() {
        Book tmp = tail;
        while (tmp != null) {
            System.out.println(tmp.id + " | " + tmp.title + " | " + tmp.author + " | " + tmp.genre + " | " + (tmp.available ? "Available" : "Not Available"));
            tmp = tmp.prev;
        }
    }

    void totalBooks() {
        System.out.println("Total Books: " + count);
    }
}

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.add_End(1, "Ramayana", "Valmiki", "Mythology", true);
        lib.add_Beg(2, "Mahabharata", "Vyasa", "Mythology", false);
        lib.add_Pos(3, "Wings of Fire", "APJ Abdul Kalam", "Autobiography", true, 2);
        lib.add_End(4, "Godaan", "Munshi Premchand", "Fiction", true);
        lib.add_End(5, "Malgudi Days", "R.K. Narayan", "Short Stories", true);
        lib.add_Beg(6, "The Discovery of India", "Jawaharlal Nehru", "History", false);
        lib.displayFwd();
        lib.update_Status(1, false);
        lib.totalBooks();
    }
}
