package modul_3.dop_zadach._04_;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        // Создаем картатеку ------------------------------------
        Book[] booksList = new Book[10];
        booksList[0] = new Book("Война и мир", 1822, 150);
        booksList[1] = new Book("Мастер и маргарита", 1900, 15);
        booksList[2] = new Book("Золушка", 1920, 50);
        Scanner sc = new Scanner(System.in);
        //-- Ввод данных -------------------------------------------
        System.out.println("Введите название книги");
        String name = sc.nextLine();
        System.out.println("Введите дату издания");
        int date = sc.nextInt();
        System.out.println("Введите цену");
        int price = sc.nextInt();
        //-- Создаем обьект ----------------------------------------
        Book book1 = new Book(name, date, price);

        addBook(booksList, book1);

        printBookList(booksList);

    }

    private static void addBook(Book[] books, Book book) {
        if (!checkBook(books, book)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    System.out.println("Книга добавлена в картотеку");
                    break;
                }
                if (i == books.length - 1) {
                    System.out.println("Картатека переполнена");
                }
            }
        }
    }

    public static boolean checkBook(Book[] books, Book book) {
        for (Book item : books) {
            if (item != null && item.nam.equals(book.nam) && item.editionYer == book.editionYer) {
                System.out.println("Такая гника есть");
                return true;
            }
        }
        System.out.println("Такой книги нет");
        return false;
    }

    private static void printBookList(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.printf("книга №%d : название:\" %s \", год издания: %dг., цена - %d usd",
                        i + 1, books[i].nam, books[i].editionYer, books[i].bookPrice);
                System.out.println();
            }
        }
    }
}
/*
Написать программу «Книжный магазин», расположенную в специальном пакете.

В программе создать класс «книга», состояние которого описывается параметрами: «название книги» (строковый),
«цена» (целочисленный), «дата издания» (целочисленный).
В основном классе создать «картотеку книг», представленную массивом «книг».

В основном или отдельном классе создать статический метод/методы, который будет осуществлять проверку по
параметрам «название книги» и «год выпуска». Есть ли такая книга в картотеке: если есть — выдавать
соответствующее сообщение), если нет — добавлять книгу в картотеку (выдавать сообщения о добавлении книги).

Если массив (картотека) заполнен — выдавать сообщение об этом.

Проверку строчных параметров («название книги») можно организовать встроенным методом String equals.

⭐ Добавить метод, который выводит в консоль (на печать) всю информацию о всех книгах (название, год издания, цену)
без конкатенации, при помощи форматирования.

Пример вывода:
книга №1: название: "The Hobbit", год издания: 1937г., цена - 999usd
книга №2: название: "......", год издания: …...г., цена - ….usd
 */