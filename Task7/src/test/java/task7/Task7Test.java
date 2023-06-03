package task7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task7Test {

    @Test
    void testVariantA() {
        int size = 4;
        char[][] expectedArray = {
                {' ', ' ', ' ', '*'},
                {' ', ' ', '*', '*'},
                {' ', '*', '*', '*'},
                {'*', '*', '*', '*'}
        };

        char[][] resultArray = Task7.variantA(size);

        assertThat(resultArray).isEqualTo(expectedArray);
    }

    @Test
    void testVariantB() {
        int size = 4;
        char[][] expectedArray = {
                {'*', ' ', ' ', ' '},
                {'*', '*', ' ', ' '},
                {'*', '*', '*', ' '},
                {'*', '*', '*', '*'}
        };

        char[][] resultArray = Task7.variantB(size);

        assertThat(resultArray).isEqualTo(expectedArray);
    }

    @Test
    void testVariantC() {
        int size = 4;
        char[][] expectedArray = {
                {'*', '*', '*', '*'},
                {' ', '*', '*', '*'},
                {' ', ' ', '*', '*'},
                {' ', ' ', ' ', '*'}
        };

        char[][] resultArray = Task7.variantC(size);

        assertThat(resultArray).isEqualTo(expectedArray);
    }

    @Test
    void testVariantD() {
        int size = 4;
        char[][] expectedArray = {
                {'*', '*', '*', '*'},
                {'*', '*', '*', ' '},
                {'*', '*', ' ', ' '},
                {'*', ' ', ' ', ' '}
        };

        char[][] resultArray = Task7.variantD(size);

        assertThat(resultArray).isEqualTo(expectedArray);
    }
}