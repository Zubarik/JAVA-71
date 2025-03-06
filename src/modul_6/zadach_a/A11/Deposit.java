package modul_6.zadach_a.A11;

public class Deposit extends Account {
    private int period;
    private double percent;

    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    /*����� ������� ���� ���� �����, �� ����� ������ ������� ������,
    ����������� �� ������� ��������, � �������� ��� (������ �� �����),
    ���� ���� ��� �� �����, �� ����� ������ ������� 0;*/
    public double withdraw() {
        if (isPeriodExpired()) {
            //double res = balance * (100 + percent) / 100;
            double res = Double.parseDouble(String.valueOf(balance * (100 + percent)))/100;
            balance = 0;
            return res;
        }
        return 0;
    }

    //��������� n ����
    public void waitDays(int n) {
        period-=n;
    }

    //����� �� ����
    private boolean isPeriodExpired() {
        return period <= 0;
    }
}
