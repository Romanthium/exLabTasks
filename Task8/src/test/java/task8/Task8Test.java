package task8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task8Test {

    @Test
    void testLeapYearCount() {
        assertThat(Task8.leapYearCount(1700)).isEqualTo(29);
        assertThat(Task8.leapYearCount(1800)).isEqualTo(53);
        assertThat(Task8.leapYearCount(1900)).isEqualTo(77);
        assertThat(Task8.leapYearCount(2001)).isEqualTo(102);
        assertThat(Task8.leapYearCount(2023)).isEqualTo(107);
    }
}
