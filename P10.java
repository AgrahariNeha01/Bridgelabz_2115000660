

interface Worker {
    void performDuties();
}

class Person {
    String n;
    int id;

    Person(String n, int id) {
        this.n = n;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + n + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String sp;

    Chef(String n, int id, String sp) {
        super(n, id);
        this.sp = sp;
    }

    public void performDuties() {
        System.out.println(n + " is cooking " + sp);
    }
}

class Waiter extends Person implements Worker {
    int t_no;

    Waiter(String n, int id, int t_no) {
        super(n, id);
        this.t_no = t_no;
    }

    public void performDuties() {
        System.out.println(n + " is serving table " + t_no);
    }
}

class P10 {
    public static void main(String[] args) {
        Chef c = new Chef("Neha", 101, "Italian Cuisine");
        Waiter w = new Waiter("Sanju", 202, 5);

        c.display();
        c.performDuties();
        w.display();
        w.performDuties();
    }
}
