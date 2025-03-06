package modul_7.unit_7_3_2;

public class Human extends Entity implements Fighter {
    public Human(String name) {
        super(name + " the Man");
    }

    public void attack(Entity m){
        m.damage(1);
    }
}
