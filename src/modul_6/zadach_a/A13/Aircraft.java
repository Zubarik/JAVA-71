package modul_6.zadach_a.A13;

public class Aircraft {
    private int number,speed;

    public Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }
    public double flight(int distance){
        return  Double.parseDouble(String.valueOf(distance/speed));
    }
}
