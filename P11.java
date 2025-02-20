import java.util.*;

class Policy implements Comparable<Policy> {
    String no, name, type;
    Date expiry;
    double amt;

    Policy(String no, String name, Date expiry, String type, double amt) {
        this.no = no;
        this.name = name;
        this.expiry = expiry;
        this.type = type;
        this.amt = amt;
    }

    @Override
    public int compareTo(Policy p) {
        return this.expiry.compareTo(p.expiry);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy p = (Policy) o;
        return Objects.equals(no, p.no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }

    @Override
    public String toString() {
        return "Policy{" + "no='" + no + "', name='" + name + "', expiry=" + expiry + ", type='" + type + "', amt=" + amt + '}';
    }
}

public class P11 {
    static Set<Policy> hSet = new HashSet<>();
    static Set<Policy> lSet = new LinkedHashSet<>();
    static Set<Policy> tSet = new TreeSet<>();

    static void addPolicy(Policy p) {
        hSet.add(p);
        lSet.add(p);
        tSet.add(p);
    }

    static void showAll(Set<Policy> s) {
        for (Policy p : s) System.out.println(p);
    }

    static void expiringSoon(Set<Policy> s) {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date limit = cal.getTime();

        for (Policy p : s) {
            if (p.expiry.before(limit)) System.out.println(p);
        }
    }

    static void byType(Set<Policy> s, String type) {
        for (Policy p : s) {
            if (p.type.equals(type)) System.out.println(p);
        }
    }

    static void duplicates() {
        Map<String, Integer> m = new HashMap<>();
        for (Policy p : hSet) m.put(p.no, m.getOrDefault(p.no, 0) + 1);
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            if (e.getValue() > 1) System.out.println("Duplicate Policy No: " + e.getKey());
        }
    }

    public static void main(String[] args) {
        addPolicy(new Policy("P101", "Neha", new Date(2025, 3, 10), "Health", 5000));
        addPolicy(new Policy("P102", "Sanju", new Date(2025, 2, 25), "Auto", 3000));
        addPolicy(new Policy("P103", "Om", new Date(2025, 4, 15), "Home", 7000));
        addPolicy(new Policy("P101", "Yuvi", new Date(2025, 3, 10), "Health", 5000)); // Duplicate

        System.out.println("All Policies (HashSet):");
        showAll(hSet);

        System.out.println("\nExpiring Soon:");
        expiringSoon(hSet);

        System.out.println("\nPolicies by Coverage Type (Health):");
        byType(hSet, "Health");

        System.out.println("\nDuplicate Policies:");
        duplicates();
    }
}
