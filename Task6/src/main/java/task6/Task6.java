package task6;

/*
6.	Write an implementation of the summ(int a, int b) method that calculates a*b without using the multiplication operation,
where a and b are integers, call the summ method in the main method and print it to the console.
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.println(summ(5, 4));
        System.out.println(summ(4, 5));
        System.out.println(summ(0, 5));
        System.out.println(summ(5, 0));
        System.out.println(summ(-5, 4));
        System.out.println(summ(5, -4));
        System.out.println(summ(-5, -4));
    }

    static int summ(int a, int b) {
        int result = 0;
        int count = b < 0 ? b * -1 : b;
        for (int i = 0; i < count; i++) {
            result += a;
        }
        return b < 0 ? result * -1 : result;
    }
}
