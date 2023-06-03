package task6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task6Test {

    @Test
    @DisplayName("Both positive")
    void testSumm_bothPositive() {
        int a = 5;
        int b = 4;
        int expected = 20;

        int result = Task6.summ(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Both negative")
    void testSumm_bothNegative() {
        int a = -5;
        int b = -4;
        int expected = 20;

        int result = Task6.summ(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("a is negative")
    void testSumm_aIsNegative() {
        int a = -5;
        int b = 4;
        int expected = -20;

        int result = Task6.summ(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("b is negative")
    void testSumm_bIsNegative() {
        int a = 5;
        int b = -4;
        int expected = -20;

        int result = Task6.summ(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("a is a zero")
    void testSumm_aIsZero() {
        int a = 0;
        int b = 4;
        int expected = 0;

        int result = Task6.summ(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("b is a zero")
    void testSumm_bIsZero() {
        int a = 5;
        int b = 0;
        int expected = 0;

        int result = Task6.summ(a, b);

        assertThat(result).isEqualTo(expected);
    }

}