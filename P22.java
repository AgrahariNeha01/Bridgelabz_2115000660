import java.util.*;

class P22 {
    public static void main(String[] args) {
        PolicyManager pm = new PolicyManager();
        
        pm.addPolicy("P1001", "Alice", "2025-03-15");
        pm.addPolicy("P1002", "Bob", "2025-02-10");
        pm.addPolicy("P1003", "Alice", "2025-02-28");
        
        System.out.println("Policy P1002: " + pm.getPolicy("P1002"));
        System.out.println("Expiring in next 30 days: " + pm.getExpiringPolicies());
        System.out.println("Policies of Alice: " + pm.getPoliciesByHolder("Alice"));
        
        pm.removeExpiredPolicies();
        System.out.println("After removing expired: " + pm.policies);
    }
}

class Policy {
    String no, holder, expiry;

    Policy(String no, String holder, String expiry) {
        this.no = no;
        this.holder = holder;
        this.expiry = expiry;
    }

    public String toString() {
        return "[" + no + ", " + holder + ", " + expiry + "]";
    }
}

class PolicyManager {
    Map<String, Policy> policies = new LinkedHashMap<>();
    TreeMap<String, Policy> sortedByExpiry = new TreeMap<>();

    void addPolicy(String no, String holder, String expiry) {
        Policy p = new Policy(no, holder, expiry);
        policies.put(no, p);
        sortedByExpiry.put(expiry, p);
    }

    Policy getPolicy(String no) {
        return policies.get(no);
    }

    List<Policy> getExpiringPolicies() {
        List<Policy> expiring = new ArrayList<>();
        String today = "2025-02-01"; 
        for (var e : sortedByExpiry.tailMap(today).values()) {
            if (e.expiry.compareTo("2025-03-01") < 0) expiring.add(e);
        }
        return expiring;
    }

    List<Policy> getPoliciesByHolder(String holder) {
        List<Policy> list = new ArrayList<>();
        for (Policy p : policies.values()) {
            if (p.holder.equals(holder)) list.add(p);
        }
        return list;
    }

    void removeExpiredPolicies() {
        String today = "2025-02-01";
        sortedByExpiry.headMap(today).clear();
        policies.values().removeIf(p -> p.expiry.compareTo(today) < 0);
    }
}
