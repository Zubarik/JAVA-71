package modul_6.zadach_a.A13;

public class Airplane extends Aeroplane{
    private int power;

    public Airplane(int number, int speed, int winngspan, int power) {
        super(number, speed, winngspan);
        this.power = power;
    }
}
