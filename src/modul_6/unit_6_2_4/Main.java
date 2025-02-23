package modul_6.unit_6_2_4;

public class Main {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();
    }
}
/*
Monster Alice the Zombie was created
Monster Alice the Zombie attacked with damage 5
Raaaauuughhhh Alice the Zombie growled
*/