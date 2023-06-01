package task1;

/*
1.	Напишите метод, который принимает в качестве параметра целое число и возвращает значение true,
если оно - симметричное (палиндром - как, например, число 53477435); в ином случае метод возвращает значение false
 */
public class Task1 {
    public static boolean isNumberPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        String numberToString = Integer.toString(number);
        int start = 0;
        int end = numberToString.length() - 1;
        while (start < end) {
            if (numberToString.charAt(start) != numberToString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
