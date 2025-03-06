package modul_6.zadach_a.A2;

public class Print {
    public void print(int a) {
        System.out.println(a+" ");
    }

    public void print(String a) {
        System.out.println(a);
    }

    public void print(int[] a) {
        StringBuilder res = new StringBuilder();
        for (int i : a) {
            res.append(i).append(" ");
        }
        System.out.println(res);
    }

    public void print(String[] a) {
        StringBuilder res = new StringBuilder();
        for (String i : a) {
            res.append(i).append(" ");
        }
        System.out.println(res);
    }
}
