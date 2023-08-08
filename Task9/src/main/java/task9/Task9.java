package task9;

/*
9. Write a program that takes a number as an input and prints its multiplication table to 10.
Test Data:
Input a number : 8
Expected result :
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
