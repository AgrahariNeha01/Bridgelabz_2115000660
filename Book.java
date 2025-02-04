import java.util.*;

public class Book {
    static String lName;
    final String isbn;
    String t, a;

    Book(String t, String a, String isbn) {
        this.t = t;
        this.a = a;
        this.isbn = isbn;
    }

    static void dLN() {
        System.out.println(lName);
    }

    void bD() {
        if (this instanceof Book) {
            System.out.println(t + " " + a + " " + isbn);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        lName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        Book[] b = new Book[n];

        for (int i = 0; i < b.length; i++) {
            String t = sc.nextLine();
            String a = sc.nextLine();
            String isbn = sc.nextLine();

            b[i] = new Book(t, a, isbn);
        }

        for (Book bk : b) {
            bk.bD();
        }

        dLN();
    }
}
