package task10;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class Task10Test {

    @Test
    public void testSumTwoBinaries() {
        String firstBinary = "1010";
        String secondBinary = "1100";
        String result = Task10.sumTwoBinaries(firstBinary, secondBinary);
        assertThat(result).isEqualTo("10110");
    }
}