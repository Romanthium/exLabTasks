package task3;

import java.util.Random;
import java.util.Scanner;

/*
3.	Напишите класс, который заполняет случайными трехзначными числами массив,
размер которого при инициализации вводится с клавиатуры. После заполнения класс
должен вывести на экран значения массива следующим образом:
• в первой строке - первую половину массива;
• во второй строке - вторую половину массива.
В случае если массив имеет нечетный размер, центральную ячейку следует выводить в первой строке.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            System.out.print("Enter array size: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Enter array size: ");
                scanner.next();
            }
            size = scanner.nextInt();
        } while (size <= 0);

        int[] array = generateArray(size);

        printOriginalArray(size, array);

        int middleIndex = size % 2 == 0 ? size / 2 : (size / 2) + 1;
        printFirstHalf(array, middleIndex);
        printSecondHalf(size, array, middleIndex);

        scanner.close();
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(900) + 100;
        }
        return array;
    }

    private static void printOriginalArray (int size, int[]array) {
        System.out.println("Original array");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    private static void printFirstHalf(int[]array, int middleIndex) {
        for (int i = 0; i < middleIndex; i++) {
            if (i != middleIndex - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + "\n");
            }
        }
    }

    private static void printSecondHalf(int size, int[]array, int middleIndex) {
        for (int i = middleIndex; i < size; i++) {
            if (i != size - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + "\n");
            }
        }
    }
}


