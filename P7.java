import java.util.*;

class User {
    int id, age;
    String name;
    List<Integer> frnds;
    User nxt;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.frnds = new ArrayList<>();
        this.nxt = null;
    }
}

class SocialMedia {
    User head = null;

    void addU(int id, String name, int age) {
        User u = new User(id, name, age);
        if (head == null) head = u;
        else {
            User tmp = head;
            while (tmp.nxt != null) tmp = tmp.nxt;
            tmp.nxt = u;
        }
    }

    User getU(int id) {
        User tmp = head;
        while (tmp != null) {
            if (tmp.id == id) return tmp;
            tmp = tmp.nxt;
        }
        return null;
    }

    void addF(int id1, int id2) {
        User u1 = getU(id1), u2 = getU(id2);
        if (u1 != null && u2 != null && !u1.frnds.contains(id2) && !u2.frnds.contains(id1)) {
            u1.frnds.add(id2);
            u2.frnds.add(id1);
        }
    }

    void rmF(int id1, int id2) {
        User u1 = getU(id1), u2 = getU(id2);
        if (u1 != null && u2 != null) {
            u1.frnds.remove(Integer.valueOf(id2));
            u2.frnds.remove(Integer.valueOf(id1));
        }
    }

    void showF(int id) {
        User u = getU(id);
        if (u == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("\n Friends of " + u.name + ": " + u.frnds);
    }

    void mutualF(int id1, int id2) {
        User u1 = getU(id1), u2 = getU(id2);
        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }
        Set<Integer> mutual = new HashSet<>(u1.frnds);
        mutual.retainAll(u2.frnds);
        System.out.println("\n Mutual Friends: " + mutual);
    }

    void searchU(String name) {
        User tmp = head;
        while (tmp != null) {
            if (tmp.name.equalsIgnoreCase(name)) {
                System.out.println("\n User Found: ID = " + tmp.id + ", Age = " + tmp.age);
                return;
            }
            tmp = tmp.nxt;
        }
        System.out.println("\nUser not found.");
    }

    void countF() {
        User tmp = head;
        while (tmp != null) {
            System.out.println(" " + tmp.name + " has " + tmp.frnds.size() + " friends.");
            tmp = tmp.nxt;
        }
    }
}

public class P7 {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        sm.addU(1, "Aryan", 20);
        sm.addU(2, "Neha", 22);
        sm.addU(3, "Rahul", 25);
        sm.addU(4, "Sanya", 21);

        sm.addF(1, 2);
        sm.addF(1, 3);
        sm.addF(2, 3);
        sm.addF(3, 4);

        sm.showF(1);
        sm.showF(2);

        sm.mutualF(1, 2);
        sm.mutualF(2, 3);

        sm.searchU("Rahul");

        sm.countF();

        sm.rmF(1, 3);
        sm.showF(1);
    }
}
