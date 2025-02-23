package modul_6.unit_6_2_4;

public class Zombie extends Monstr{

    public Zombie(String name) {
        super(name+" the Zombie ",5 );
    }

    @Override
    public void growl() {
        System.out.print("Raaaauuughhhh");
        super.growl();
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }
}
