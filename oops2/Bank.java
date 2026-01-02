class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(double bal, double amt) {
        super("Insufficient Balance " + bal + " for withdrawal of " + amt);
    }
}

class Bank {
    double balance = 5000;

    void withdraw(double amt) throws InsufficientBalanceException {
        if (amt > balance)
            throw new InsufficientBalanceException(balance, amt);
        balance -= amt;
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(7000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

