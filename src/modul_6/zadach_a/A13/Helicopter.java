package modul_6.zadach_a.A13;

public class Helicopter extends Aircraft{
    private int screwDiametr,power;

    public Helicopter(int number, int speed, int screwDiametr, int power) {
        super(number, speed);
        this.screwDiametr = screwDiametr;
        this.power = power;
    }
}
