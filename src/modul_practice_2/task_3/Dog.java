package modul_practice_2.task_3;

public class Dog implements Movable,Eat{
    @Override
    public void eat() {
        System.out.println("Ест мышей и котов!");
    }

    @Override
    public void move() {
        System.out.println("Быстро бегает!");
    }
}
