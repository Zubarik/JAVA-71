package modul_6.zadach_a.A14;

public class Book extends PrintEdition {
    private int quantityOfPages;
    private int year;
    private String author;
    private String[] pages;

    public Book(String name, int quantityOfPages, int year, String author, String[] pages) {
        super(name);
        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;

        this.pages = new String[quantityOfPages + 1];
        this.pages[0] = name + " " + author;

        for (int i = 1; i < this.pages.length; i++) {
            this.pages[i] = pages[i - 1];
        }
    }

    public String getPage(int n) {
        return pages[n];
    }
}
