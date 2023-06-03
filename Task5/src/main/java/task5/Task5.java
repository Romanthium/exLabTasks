package task5;

/*
5.	Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой
выведите значение суммы и индексы(i,j) первого элемента тройки.
Пример:
*Для простоты пример показан на одномерном массиве размера 10
[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
Вывод в консоль:
11535 (0,5)
 */

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int size = 10;
        int[][] array = generateRandomMatrix(size);
        printMatrix(size, array);
        findMaximumAdjacentSum(array);
    }

    private static int[][] generateRandomMatrix(int size) {
        int[][] array = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(10000);
            }
        }
        return array;
    }

    private static void printMatrix(int size, int[][] array) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%6d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void findMaximumAdjacentSum(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        int idxI = 0;
        int idxJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                int sum = array[i][j] + array[i][j + 1] + array[i][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    idxI = i;
                    idxJ = j;
                }
            }
        }
        System.out.printf("%d (%d, %d)", maxSum, idxI, idxJ);
    }
}
