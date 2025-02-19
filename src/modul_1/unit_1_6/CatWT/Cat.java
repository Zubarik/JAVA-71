package modul_1.unit_1_6.CatWT;

public class Cat {

    private final double originWeight;
    private double weight;

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight) {
        this.weight = weight;
        this.originWeight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void woof() {
        weight = weight - 1;
        System.out.println("Woof");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public void pee() {
        weight = weight - 10;
        System.out.println("Clean it, man!");
    }
}
