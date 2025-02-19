package modul_2.unit_2_7_5;

public class Main {
    public static void main(String[] args) {
        int signal1 = 0;
        int signal2 = -1;
        int signal3 = 1;

        System.out.println(svetofor(signal1));
        System.out.println(svetofor(signal2));
        System.out.println(svetofor(signal3));
    }

    public static String svetofor(int signal) {
        switch (signal) {
            case -1:
                return "Подождать";
            case 0:
                return "Остановиться";
            case 1:
                return "Ехать";
            default:
                return "Результат неочевиден, ошибка";
        }
    }
}
