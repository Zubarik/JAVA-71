package modul_3.unit_3_2_7;

public class Main {
    public static void main(String[] args) {
        String a = "Иван Иванов";
        String b = "Вован Иванов Иванович";

        checkUserName(a, b);
    }

    private static void checkUserName(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.print("Отличное имя! ");
            System.out.printf("Ваше имя имеет длину " + s2.length() + " символов. ");
            System.out.println("А без пробелов ваше имя занимает "
                    +s2.replaceAll(" ","").length()+" символов");
        }
    }
}
