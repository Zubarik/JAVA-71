package modul_6.zadach_a.A14;

public class Scoolbook extends Book{
    private String subject;
    private int grade;

    public Scoolbook(String name, int quantityOfPages, int year, String author, String[] pages, String subject, int grade) {
        super(name, quantityOfPages, year, author, pages);
        this.subject = subject;
        this.grade = grade;
    }
}
