

class BankAccount {
    int acc_no;
    double bal;

    BankAccount(int acc_no, double bal) {
        this.acc_no = acc_no;
        this.bal = bal;
    }

    void display() {
        System.out.println("Account No: " + acc_no + ", Balance: ?" + bal);
    }
}

class SavingsAccount extends BankAccount {
    double i_rate;

    SavingsAccount(int acc_no, double bal, double i_rate) {
        super(acc_no, bal);
        this.i_rate = i_rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + i_rate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double w_limit;

    CheckingAccount(int acc_no, double bal, double w_limit) {
        super(acc_no, bal);
        this.w_limit = w_limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: ?" + w_limit);
    }
}

class FixedDepositAccount extends BankAccount {
    int term;

    FixedDepositAccount(int acc_no, double bal, int term) {
        super(acc_no, bal);
        this.term = term;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Term: " + term + " years");
    }
}

class P8 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount c = new CheckingAccount(102, 20000, 10000);
        FixedDepositAccount f = new FixedDepositAccount(103, 100000, 5);

        s.display();
        s.displayAccountType();
        c.display();
        c.displayAccountType();
        f.display();
        f.displayAccountType();
    }
}
