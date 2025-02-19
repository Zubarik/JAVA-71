package modul_3.dop_zadach._02_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCorrectPassword = false;
        System.out.println("Введите имя");
        String  name = sc.nextLine();
        String pw = null;
        while (!isCorrectPassword) {
            System.out.println("Введите пароль");
            pw = sc.nextLine();
            if (pw.length() < 8 || pw.length() > 15) {
                System.out.println("Длинна пароля должна составлять от 8 до 15 символов");
            } else {
                System.out.println("Добро пожаловать!!!");
                isCorrectPassword = true;
            }
        }
        System.out.printf("Ваше имя: " + name + " Ваш пароль: " + pw);
    }
}
