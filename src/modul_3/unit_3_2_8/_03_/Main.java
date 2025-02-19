package modul_3.unit_3_2_8._03_;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //—читывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("¬ведите корректное им€!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] pars = name.split(" ");
        return pars.length == 3;
    }

    private static String formatName(String name) {
        String[] pars = name.split(" ");
        sortByLength(pars);
        String res = "";
        for (int i = 0; i < pars.length; i++) {
            String word = pars[i];
            char str = word.charAt(0);
            if (!Character.isUpperCase(str)){
                res += Character.toUpperCase(str)+word.substring(1)+" ";
            }else {
                res += word + "";
            }
        }
        return res;
    }

    private static void sortByLength(String[] words) {
        for (int i = 0; i < words.length-1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = tmp;
                }
            }
        }
    }
}
