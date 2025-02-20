class P6 {
    static double calculateInterest(double amt, double rate, int yrs) throws IllegalArgumentException {
        if (amt < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amt * rate * yrs) / 100;
    }

    public static void main(String[] args) {
        try {
            double interest = calculateInterest(1000, 5, 2);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
