package task4;

import java.util.Random;
import java.util.Scanner;

/*
4.	Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
Пример:
          1 2 3 4      1 6 3 1
          6 7 8 9      2 7 3 5
          3 3 4 5      3 8 4 6
          1 5 6 7      4 9 5 7

 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            System.out.print("Enter matrix size: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Enter matrix size: ");
                scanner.next();
            }
            size = scanner.nextInt();
        } while (size <= 0);

        int[][] array = generateRandomMatrix(size);

        printMatrix(size, array);

        printTransparentMatrix(size, array);

        scanner.close();
    }

    static int[][] generateRandomMatrix(int size) {
        int[][] array = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        return array;
    }

    private static void printMatrix(int size, int[][] array) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printTransparentMatrix(int size, int[][] array) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", array[j][i]);
            }
            System.out.println();
        }
    }
}
