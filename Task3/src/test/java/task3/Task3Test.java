package task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class Task3Test {
    @Test
    @DisplayName("Generated array")
    public void testGenerateArray() {
        int size = 10;
        int[] array = Task3.generateArray(size);

        assertThat(array).hasSize(size);

        for (int number : array) {
            assertThat(number).isBetween(100, 999);
        }
    }

}