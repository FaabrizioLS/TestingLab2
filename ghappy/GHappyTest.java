package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "input={0}, expected={1}")
    @CsvSource({
            "'xxggxx', true",
            "'xxgxx', false",
            "'xxggyygxx', false",
            "'gg', true",
            "'g', false",
            "'ggg', true",
            "'ggggg', true",
            "'xxggxggxx', true",
            "'ggxgxxgg', false"
    })
    public void testGHappy(String input, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
