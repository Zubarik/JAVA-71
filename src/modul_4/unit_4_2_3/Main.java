package modul_4.unit_4_2_3;

public class Main {
    public static void main(String[] args) {
        // At (0;0) fuel=100
        Tank justTank = new Tank();
        // At (10;10) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);

        justTank.goForward(200);
        justTank.printPosition();

        anywareTank.goBackward(-200);
        anywareTank.printPosition();

        customTank.goForward(201);
        customTank.printPosition();
    }
}