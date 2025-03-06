package modul_8.unit_8_3_1;

public class Main {
    public static void main(String[] args) {
        CoolPrinter.add("One, two,");
        CoolPrinter.add("I love you.");
        CoolPrinter.add("Three, four,");
        CoolPrinter.add("Touch the floor.");
        CoolPrinter.print(new Formatter() {
            @Override
            public String format(String line) {
                return "** " + line + " **";
            }
        });

    }
}
/*Должна вывести:
 ** One, two, **
 ** I love you. **
 ** Three, four, **
 ** Touch the floor. **
 * */