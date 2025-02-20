import java.util.*;

class P23 {
    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        
        vs.vote("Alice");
        vs.vote("Bob");
        vs.vote("Alice");
        vs.vote("Charlie");
        vs.vote("Bob");
        vs.vote("Alice");

        System.out.println("Vote Count: " + vs.getVoteCount());
        System.out.println("Sorted Results: " + vs.getSortedResults());
        System.out.println("Vote Order: " + vs.getVoteOrder());
    }
}

class VotingSystem {
    Map<String, Integer> voteCount = new HashMap<>();
    TreeMap<String, Integer> sortedResults = new TreeMap<>();
    LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

    void vote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        sortedResults.put(candidate, sortedResults.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    Map<String, Integer> getVoteCount() {
        return voteCount;
    }

    Map<String, Integer> getSortedResults() {
        return sortedResults;
    }

    Map<String, Integer> getVoteOrder() {
        return voteOrder;
    }
}
