package modul_2.unit_2_9_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt(); //��������� �����
/*����� next() ������ Scanner ��������� ������,
� ����� charAt(0) ��������� ����� ������ ������ � ���� ������.
 ��� �� �������� ��������, ������� ����� ���������*/
        char operation = scanner.next().charAt(0);
        int operand2=scanner.nextInt();

        switch (operation){
            case '+':
                System.out.println("Suma = "+(operand1+operand2));break;
            case '-':
                System.out.println("Otrecan = "+(operand1-operand2));break;
            case '*':
                System.out.println("Umnogen = "+ (operand1*operand2));break;
            case '/':
                System.out.println("Delenie = "+ (operand1/operand2));break;
            default:
                System.err.println("Error");break;
        }

    }
}
