package modul_3.dop_zadach._03_;

public class Main {
    public static void main(String[] args) {
        int[] sum = new int[5];
        String[] arrGamers = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        int[][] point = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9}
        };
        for (int i = 0; i < arrGamers.length; i++) {
            System.out.printf(arrGamers[i] + " ");
            for (int j = 0; j < point.length; j++) {
                    System.out.printf(point[i][j] + " ");
                    sum[i] += point[i][j];
            }
            System.out.println("Общий: " + sum[i]);
        }
    }
}
