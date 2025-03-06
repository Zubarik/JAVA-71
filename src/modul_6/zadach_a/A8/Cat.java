package modul_6.zadach_a.A8;

public class Cat {
    private String name;
    private int age;
    private String owner;

    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "The cat " + name + " is already " + age + "." + " Her master " + owner + "  takes care of her.";
    }

    public void eat() {
    }

    public void run() {
    }
}
/*    is already "age". Her master "the name of the master" takes care of her.*/