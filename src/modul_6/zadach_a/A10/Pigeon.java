package modul_6.zadach_a.A10;

public class Pigeon extends Bird {
    private int hunger;

    public Pigeon(String type, String[] continents, int population, int hunger) {
        super("Pigeon", continents, population);
        this.hunger = hunger;
    }

    //������� ������ ��������� hunger �� 7
    public void askForSeeds() {
        this.hunger = (this.hunger - 7 <= 0 ? this.hunger = 0 : this.hunger - 7);
    }

    // ��� ���������� ������ 3 ���� ������,
    public void sleep() {
        hunger += 3;
    }

    //������������ �������� ������.
    public int getHunger() {
        return hunger;
    }
}
