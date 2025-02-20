import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class P10 {
    double bal;

    P10(double bal) {
        this.bal = bal;
    }

    void withdraw(double amt) throws InsufficientBalanceException {
        if (amt < 0) throw new IllegalArgumentException("Invalid amount!");
        if (amt > bal) throw new InsufficientBalanceException("Insufficient balance!");
        bal -= amt;
        System.out.println("Withdrawal successful, new balance: " + bal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P10 acc = new P10(5000);
        double amt = sc.nextDouble();

        try {
            acc.withdraw(amt);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
