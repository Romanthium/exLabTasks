package task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task4Test {

    @Test
    @DisplayName("Generate random matrix")
    void generateRandomMatrix() {
        int size = 10;
        int[][] matrix = Task4.generateRandomMatrix(size);

        assertThat(matrix).hasDimensions(size, size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                assertThat(matrix[i][j]).isBetween(0, 50);
            }
        }
    }
}