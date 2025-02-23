package modul_6.unit_6_4_5;

public class Monstr {
    private String name;
    private int damage;

    public Monstr(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster "+name+" was created");
    }

    public void   attack(){
        System.out.println("Monster "+ name +" attacked with damage "+damage);
    }

    public void growl(){
        System.out.println(name+" growled");
    }
}
