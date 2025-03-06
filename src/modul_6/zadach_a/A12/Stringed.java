package modul_6.zadach_a.A12;

public class Stringed extends MusicalInstrument{
    private int quantityOfStrings;

    public Stringed(String name, String manufacturer, int price, int quantityOfStrings) {
        super(name, manufacturer, price);
        this.quantityOfStrings = quantityOfStrings;
    }
    public String play(){
        return getName()+" sounds beautiful";
    }
}
