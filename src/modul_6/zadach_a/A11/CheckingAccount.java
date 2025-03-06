package modul_6.zadach_a.A11;

public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int n) {
        balance -= n;
    }

    @Override
    public void put(int n) {
        super.put(n);
    }

    //вернёт задолженность по счёту
    public int getDebt() {
        return balance < 0 ? Math.abs(balance) : 0;
    }
}
