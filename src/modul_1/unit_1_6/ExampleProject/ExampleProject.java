package modul_1.unit_1_6.ExampleProject;

public class ExampleProject {
    public static void main(String[] args) {
        int[] arr = {15, 27, 3, 344, 17 };
        int summ = 0;
        for (int i: arr) {
            summ += i;
        }
        System.out.println(summ / arr.length);
    }
}
