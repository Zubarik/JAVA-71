package modul_2.unit_2_2_1;


public class Main {
    public static void main(String[] args) {
        Car.staticBuild();
    }
}

class Car {
    public void build() {
        System.out.println("Не статический");
    }

    public static void staticBuild() {
        System.out.println("Статический");
    }
}
