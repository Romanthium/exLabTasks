package task10;

/*
Напишите программу на Java, чтобы сложить два двоичных числа. Перейти к редактору
Входные данные:
Введите первое двоичное число: 10
Введите второе двоичное число: 11
Ожидаемый результат:

Сумма двух двоичных чисел: 101
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("The sum of two binaries is " + sumTwoBinaries(readNumber("Enter the first binary number: "), readNumber("Enter the second binary number: ")));
    }

    static String readNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        String number = "";
        System.out.print(message);
        do {
            while (!scanner.hasNext()) {
                System.out.print(message);
                scanner.next();
            }
            number = scanner.next();
        } while (!number.matches("^([0-1]){1,8}$"));

        return number;
    }

    static String sumTwoBinaries(String firstBinary, String secondBinary) {
        int firstAsDecimal = Integer.parseInt(firstBinary, 2);
        int secondAsDecimal = Integer.parseInt(secondBinary, 2);
        return Integer.toBinaryString(firstAsDecimal + secondAsDecimal);
    }
}
