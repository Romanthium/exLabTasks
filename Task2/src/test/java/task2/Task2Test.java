package task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task2Test {

    @Test
    @DisplayName("Number without zeroes")
    public void testReverseNumber_NumberWithoutZeroes() {
        int input = 12345;
        int expectedOutput = 54321;

        int result = Task2.reverseNumber(input);

        assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Number with zero at the end")
    public void testReverseNumber_NumberWithZeroEnd() {
        int input = 123450;
        int expectedOutput = 54321;

        int result = Task2.reverseNumber(input);

        assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Number with zeroes in the middle")
    public void testReverseNumber_NumberWithZeroesInMiddle() {
        int input = 12030045;
        int expectedOutput = 54003021;

        int result = Task2.reverseNumber(input);

        assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Single digit")
    public void testReverseNumber_SingleDigitNumber() {
        int input = 8;
        int expectedOutput = 8;

        int result = Task2.reverseNumber(input);

        assertThat(result).isEqualTo(expectedOutput);
    }
}