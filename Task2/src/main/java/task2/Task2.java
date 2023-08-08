package task2;

/*
2.	Write a method that accepts a positive integer as a parameter and returns a number with the opposite order of digits.
For example, for 123 the method will return 321, for 120 the method will return 21.
 */

public class Task2 {
    public static int reverseNumber(int number) {
        StringBuilder resultString = new StringBuilder();
        while (number > 0) {
            resultString.append(number % 10);
            number /= 10;
        }
        return Integer.parseInt(resultString.toString());
    }
}
