

class Book {
    String t;
    int p_yr;

    Book(String t, int p_yr) {
        this.t = t;
        this.p_yr = p_yr;
    }

    void displayInfo() {
        System.out.println("Title: " + t + ", Year: " + p_yr);
    }
}

class Author extends Book {
    String n, bio;

    Author(String t, int p_yr, String n, String bio) {
        super(t, p_yr);
        this.n = n;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Title: " + t + ", Year: " + p_yr + ", Author: " + n + ", Bio: " + bio);
    }
}

class P4 {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2021, "Neha", "Tech Enthusiast & Coder");
        a.displayInfo();
    }
}
