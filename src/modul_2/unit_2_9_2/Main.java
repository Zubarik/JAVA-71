package modul_2.unit_2_9_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean fStop = true;//выход
        boolean fFirst = true;//первый проход


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый операнд:");
        int operand1 = scanner.nextInt(); //считывает число
        char operation = scanner.next().charAt(0);//считывает первый символ
        int operand2 = scanner.nextInt();

        do {
            if (fFirst) {
                operand1 = calculate(operand1, operation, operand2);
                System.out.println(operand1);
                fFirst = false;
            } else {
                operation = scanner.next().charAt(0);
                if (operation == 'c') {
                    System.out.println("Введите первый операнд:");
                    operand1 = scanner.nextInt();
                    operation = scanner.next().charAt(0);
                    operand2 = scanner.nextInt();
                    System.out.println(operand1 = calculate(operand1, operation, operand2));
                } else {
                    if (operation == 's') break;
                    operand2 = scanner.nextInt();
                    operand1 = calculate(operand1, operation, operand2);
                    System.out.println(operand1);
                }
            }
        } while (fStop);


    }

    private static int calculate(int operand1, char operation, int operand2) {
        switch (operation) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                return -1;
        }

    }
}
