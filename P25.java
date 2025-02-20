import java.util.*;

class P25 {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount(101, 5000);
        bank.addAccount(102, 8000);
        bank.addAccount(103, 3000);

        System.out.println("Customer Balances: " + bank.getCustomerBalances());
        System.out.println("Sorted by Balance: " + bank.getSortedByBalance());

        bank.requestWithdrawal(101, 2000);
        bank.requestWithdrawal(103, 500);
        bank.processWithdrawals();

        System.out.println("Updated Balances: " + bank.getCustomerBalances());
    }
}

class BankingSystem {
    Map<Integer, Integer> customerBalances = new HashMap<>();
    TreeMap<Integer, Integer> sortedByBalance = new TreeMap<>();
    Queue<int[]> withdrawalRequests = new LinkedList<>();

    void addAccount(int accNo, int balance) {
        customerBalances.put(accNo, balance);
        sortedByBalance.put(balance, accNo);
    }

    void requestWithdrawal(int accNo, int amt) {
        if (customerBalances.containsKey(accNo) && customerBalances.get(accNo) >= amt) {
            withdrawalRequests.add(new int[]{accNo, amt});
        }
    }

    void processWithdrawals() {
        while (!withdrawalRequests.isEmpty()) {
            int[] request = withdrawalRequests.poll();
            int accNo = request[0], amt = request[1];
            customerBalances.put(accNo, customerBalances.get(accNo) - amt);
        }
    }

    Map<Integer, Integer> getCustomerBalances() {
        return customerBalances;
    }

    Map<Integer, Integer> getSortedByBalance() {
        return sortedByBalance;
    }
}
