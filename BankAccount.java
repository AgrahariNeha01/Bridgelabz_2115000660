import java.util.*;

public class BankAccount {
    static String bName;
    static int tA;
    final String accNo;
    String accHolder, accType;

    BankAccount(String accHolder, String accType, String accNo) {
        this.accHolder = accHolder;
        this.accType = accType;
        this.accNo = accNo;
        tA++;
    }

    static void gTA() {
        System.out.println(tA);
    }

    void aD() {
        if (this instanceof BankAccount) {
            System.out.println(accHolder + " " + accNo + " " + accType);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        BankAccount[] accounts = new BankAccount[n];

        for (int i = 0; i < accounts.length; i++) {
            String accHolder = sc.nextLine();
            String accType = sc.nextLine();
            String accNo = sc.nextLine();

            accounts[i] = new BankAccount(accHolder, accType, accNo);
        }

        for (BankAccount account : accounts) {
            account.aD();
        }

        gTA();
    }
}
