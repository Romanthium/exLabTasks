package task2;

/*
2.	Напишите метод, который принимает в качестве параметра положительное целое число
и возвращает число с противоположным порядком цифр.
Например, для параметра 123 метод возвратит 321, для параметра 120 метод вернет 21.
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
