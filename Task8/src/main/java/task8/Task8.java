package task8;

import java.util.stream.IntStream;

/*
8.	In the Gregorian calendar, a year is a leap year in two cases: either it is a multiple of 4 but not a multiple of 100,
or it is divisible by 400. Implement a method that calculates the number of leap years from the beginning of our era (the first year)
up to and including the given year.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(leapYearCount(2023));
    }

    static long leapYearCount(int currentYear) {
        return IntStream.range(1582, currentYear)
                .filter(y -> (y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
                .count();
    }
}
