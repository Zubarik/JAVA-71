package modul_8.unit_8_2_1;

abstract class Entity {
    private String name;
    private int hp = 100;
    private boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }
}
