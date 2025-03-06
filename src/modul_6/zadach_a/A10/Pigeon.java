package modul_6.zadach_a.A10;

public class Pigeon extends Bird {
    private int hunger;

    public Pigeon(String type, String[] continents, int population, int hunger) {
        super("Pigeon", continents, population);
        this.hunger = hunger;
    }

    //функция должна уменьшить hunger на 7
    public void askForSeeds() {
        this.hunger = (this.hunger - 7 <= 0 ? this.hunger = 0 : this.hunger - 7);
    }

    // сон прибавляет голубю 3 очка голода,
    public void sleep() {
        hunger += 3;
    }

    //возвращающий значение голода.
    public int getHunger() {
        return hunger;
    }
}
