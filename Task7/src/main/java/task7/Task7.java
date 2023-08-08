package task7;

/*
7. A two-dimensional array of dimension 4 by 4 is given, draw four triangles of the form:

     a)                  b)
             *        *
           * *        * *
         * * *        * * *
       * * * *        * * * *

     c)                  d)
       * * * *        * * * *
         * * *        * * *
           * *        * *
             *        *
 */

public class Task7 {
    public static void main(String[] args) {
        int size = 4;

        printArray(size, variantA(size));
        System.out.println();
        printArray(size, variantB(size));
        System.out.println();
        printArray(size, variantC(size));
        System.out.println();
        printArray(size, variantD(size));
    }

    static void printArray(int size, char[][] array) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] variantA(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (j >= size - i - 1 ? '*' : ' ');
            }
        }
        return array;
    }

    static char[][] variantB(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (j <= i ? '*' : ' ');
            }
        }
        return array;
    }

    static char[][] variantC(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (j >= i ? '*' : ' ');
            }
        }
        return array;
    }

    static char[][] variantD(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (j <= size - i - 1 ? '*' : ' ');
            }
        }
        return array;
    }
}
