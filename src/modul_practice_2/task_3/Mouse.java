package modul_practice_2.task_3;

public class Mouse implements Movable,Edible{
    @Override
    public void move() {
        System.out.println("������ ��������");
    }

    @Override
    public void beEaten() {
        System.out.println("������ �����!!!");
    }
}
