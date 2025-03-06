package modul_practice_2.task_5;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivanov",28,"Docent","Matematic");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getProfession());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.giveALesson());

    }
}
