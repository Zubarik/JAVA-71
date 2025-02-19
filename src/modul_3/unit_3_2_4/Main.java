package modul_3.unit_3_2_4;

public class Main {
    public static void main(String[] args) {
        String a = "Иван Иванов";
        String b = "иванw иванов";

        if (a.equalsIgnoreCase(b)){
            System.out.println("Выберите другое имя пользователя");
        }else {
            System.out.println("Отличное имя!");
        }
    }
}
