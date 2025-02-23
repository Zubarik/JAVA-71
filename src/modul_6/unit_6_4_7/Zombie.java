package modul_6.unit_6_4_7;

import java.util.Locale;

public class Zombie extends Monstr {
    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + " the Zombie ", 5);
    }

    @Override
    public void growl() {
        System.out.print(scream + " ");
        super.growl();
    }

    public void growl(boolean f) {
        if (f) {
            System.out.print(scream.toUpperCase(Locale.ROOT) + " ");
            super.growl();
        } else {
            growl();
        }
    }


    @Override
    public void attack() {
        super.attack();
        growl();
    }
}

