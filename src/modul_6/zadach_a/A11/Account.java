package modul_6.zadach_a.A11;

public abstract class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    //снять со счета
    public void withdraw(int n) {
        balance = n > balance ? 0 : balance - n;
    }

    //положить деньги на счёт
    public void put(int n) {
        balance += n;
    }

    //проверить баланс
    public int checkBalance() {
        return balance;
    }
}
