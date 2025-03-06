package modul_6.zadach_a.A8;

public class PedigreeCat extends Cat {
    private String breed;


    public PedigreeCat(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "The cat " + this.getName() + " is very beautiful, although she is now " + this.getAge() +
                ", she belongs to the breed " + breed + ", and her owner " + this.getOwner() + " is very proud of her.";
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
