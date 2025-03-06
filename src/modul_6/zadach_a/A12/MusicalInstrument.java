package modul_6.zadach_a.A12;

public class MusicalInstrument {
    private String name;
    private String manufacturer;
    private int price;

    public MusicalInstrument(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String info(){
        return name+" "+manufacturer+" "+price;
    }

    public String getName() {
        return name;
    }
}
