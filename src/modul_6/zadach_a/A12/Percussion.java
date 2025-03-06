package modul_6.zadach_a.A12;

public class Percussion extends MusicalInstrument{
    private int year;

    public Percussion(String name, String manufacturer, int price, int year) {
        super(name, manufacturer, price);
        this.year = year;
    }

    public String play(){
        return "Bump";
    }
}
