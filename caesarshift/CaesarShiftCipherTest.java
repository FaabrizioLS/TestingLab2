package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "message={0}, shift={1}, expected={2}")
    @CsvSource({
            "'abc', 3, 'def'",
            "'xyz', 3, 'abc'",
            "'abc', -3, 'xyz'",
            "'abc def', 1, 'bcd efg'",
            "'abcd z', 4, 'efgh d'",
            "'abc123', 3, 'invalid'",
            "'abc@xyz', 3, 'invalid'",
            "'xyz abc', -2, 'vwx yza'"
    })
    public void testCaesarShiftCipher(String message, int shift, String expectedResult) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
