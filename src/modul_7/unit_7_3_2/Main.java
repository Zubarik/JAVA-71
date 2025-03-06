package modul_7.unit_7_3_2;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Human("Vasiliy"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new Tower("Big Ben"));

        battle.start();
    }
}
