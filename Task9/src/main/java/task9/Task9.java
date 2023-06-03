package task9;

/*
Напишите программу на Java, которая принимает число в качестве входных данных и печатает свою таблицу умножения до 10.
Тестовые данные:
Введите число: 8
Ожидаемый результат :
8 х 1 = 8
8 х 2 = 16
8 х 3 = 24
……………
8 х 10 = 80
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        multiplicationTable(readNumber());
    }

    static void multiplicationTable(int multiplier) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", multiplier, i, multiplier * i);
        }
    }

    static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter the multiplier: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter the multiplier: ");
            scanner.next();
        }
        number = scanner.nextInt();

        return number;
    }
}
