package modul_4.unit_4_1_1;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.goForward(50);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();
    }
}
