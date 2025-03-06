package modul_practice_2.task_3;

public class Cat implements Movable,Eat,Edible{
    @Override
    public void eat() {
        System.out.println("Ест мышей!");
    }

    @Override
    public void beEaten() {
        System.out.println("Боится собак!");
    }

    @Override
    public void move() {
        System.out.println("Ловко лазает везде!");
    }
}
