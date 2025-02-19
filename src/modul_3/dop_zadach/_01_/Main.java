package modul_3.dop_zadach._01_;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {5, 24, 3, 66, 38, 16, 27};
        for (int num :array) {System.out.printf(num+" ");}
        System.out.println();
        System.out.println(array[2]);
        Arrays.sort(array);
        for (int num :array) {System.out.printf(num+" ");}
        System.out.println();
        System.out.println(array[2]);
        System.out.println(Arrays.toString(array));
    }
}
