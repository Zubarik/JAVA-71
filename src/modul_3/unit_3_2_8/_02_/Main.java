package modul_3.unit_3_2_8._02_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = sc.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        String [] pars = name.split(" ");
        if (!(pars.length==3)){
            return false;
        }else {
            return true;
        }
    }
}
