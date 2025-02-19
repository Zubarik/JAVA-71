package modul_2.unit_2_2_4;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.build();
        newCar.buy();

        int a = 10;
        int b = 25;
        System.out.println(a + b * 10 >= 255 && 4 << 1 <= 14);

    }
}

class Car {

    public void build() {
        System.out.println("You must build a new car");
    }

    public void buy() {
        System.out.println("I will buy this car");
    }
}