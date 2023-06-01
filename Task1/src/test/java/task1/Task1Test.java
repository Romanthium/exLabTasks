package task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class Task1Test {

    @Test
    @DisplayName("Should be true")
    void isNumberPalindrome_shouldReturnTrue() {
        int palindromeNumber = 53477435;

        boolean result = Task1.isNumberPalindrome(palindromeNumber);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Should be false")
    void isNumberPalindrome_shouldReturnFalse() {
        int palindromeNumber = 53475347;

        boolean result = Task1.isNumberPalindrome(palindromeNumber);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Should be true with negative number")
    void isNumberPalindrome_shouldReturnTrueWithNegativeNumber() {
        int palindromeNumber = -53477435;

        boolean result = Task1.isNumberPalindrome(palindromeNumber);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Should be true with single digit")
    void isNumberPalindrome_shouldReturnTrueWithSingleDigit() {
        int palindromeNumber = 5;

        boolean result = Task1.isNumberPalindrome(palindromeNumber);

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Should be true with zero")
    void isNumberPalindrome_shouldReturnTrueWithZero() {
        int palindromeNumber = 0;

        boolean result = Task1.isNumberPalindrome(palindromeNumber);

        assertThat(result).isTrue();
    }
}