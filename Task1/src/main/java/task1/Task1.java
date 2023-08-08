package task1;

/*
1.	Write a method that takes an integer as a parameter and returns true,
if it is symmetric (a palindrome, such as the number 53477435); otherwise, the method returns false
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
