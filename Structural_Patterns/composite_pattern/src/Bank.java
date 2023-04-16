public class Bank implements  Authentication, Depositing, Withdrawing {

    Account a;
    Security s;

    @Override
    public boolean authenticate() {
        return s.authenticate();
    }

    @Override
    public int deposit() {
        authenticate();
        return a.deposit();
    }

    @Override
    public int withdraw() {
        authenticate();
        return a.withdraw();
    }
}
