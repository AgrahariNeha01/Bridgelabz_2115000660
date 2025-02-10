import java.util.*;

abstract class BankAccount {
    private String accNo, hName;
    private double bal;

    public BankAccount(String accNo, String hName, double bal) {
        this.accNo = accNo;
        this.hName = hName;
        this.bal = bal;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getHName() {
        return hName;
    }

    public double getBal() {
        return bal;
    }

    public void deposit(double amt) {
        if (amt > 0) bal += amt;
    }

    public void withdraw(double amt) {
        if (amt > 0 && bal >= amt) bal -= amt;
    }

    public abstract double calcInt();
}

interface Loanable {
    boolean applyLoan(double amt);
    double loanEligibility();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String hName, double bal) {
        super(accNo, hName, bal);
    }

    public double calcInt() {
        return getBal() * 0.04;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String hName, double bal) {
        super(accNo, hName, bal);
    }

    public double calcInt() {
        return getBal() * 0.02;
    }

    public boolean applyLoan(double amt) {
        return amt <= loanEligibility();
    }

    public double loanEligibility() {
        return getBal() * 2;
    }
}

public class P4 {
    public static void main(String[] args) {
        List<BankAccount> accList = new ArrayList<>();
        accList.add(new SavingsAccount("SA101", "Neha", 50000));
        accList.add(new CurrentAccount("CA102", "Rahul", 100000));

        for (BankAccount acc : accList) {
            System.out.println("Account: " + acc.getHName() + ", Interest: " + acc.calcInt());
            if (acc instanceof Loanable) {
                Loanable lAcc = (Loanable) acc;
                System.out.println("Loan Eligibility: " + lAcc.loanEligibility());
            }
        }
    }
}
