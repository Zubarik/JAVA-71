package modul_6.zadach_a.A9;

public class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private int age;

    public StarSystem(String starName, int quantityOfPlanets, int age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanets;
        this.age = age;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public void setQuantityOfPlanets(int quantityOfPlanets) {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStarName() {
        return starName;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public int getAge() {
        return age;
    }

    public String getInfo(){
        return starName+" "+quantityOfPlanets+" "+age ;
    }

}
