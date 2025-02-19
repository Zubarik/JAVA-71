package modul_3.unit_3_1_3;

public class Main {
    public static void main(String[] args) {
        int[] array = {13, 32, 39, 4, 55, 36, 7, 82, 99, 10};
        int[] copy = array;
        for (int arr : array) {System.out.print(arr+" ");}
        System.out.println();
        for (int arr : copy) {System.out.print(arr+" ");}
        System.out.println();
        for (int i = 0; i < copy.length; i++) {
            copy[i] = copy[i] * 2;
        }
        for (int arr : copy) {System.out.print(arr+" ");}
    }
}
