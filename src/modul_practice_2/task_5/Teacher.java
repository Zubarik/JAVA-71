package modul_practice_2.task_5;

public class Teacher extends People{
    private String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public String giveALesson(){
        return "The lesson was ended";
    }
}
