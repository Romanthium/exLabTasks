package task8;

import java.util.stream.IntStream;

/*
8.	В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100,
либо кратен 400. Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года)
до заданного года включительно.
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
