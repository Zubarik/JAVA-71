package modul_8.unit_8_2_1;

public class Human extends Entity implements Fighter {
    public Human(String name) {
        super(name + " the Man");
    }

    public void attack(Entity m){
        m.damage(1);
    }
}
