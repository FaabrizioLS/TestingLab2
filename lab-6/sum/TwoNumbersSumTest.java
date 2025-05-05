package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    @Test
    public void testEqualSizeNoCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(2, 3)),
                new ArrayList<>(Arrays.asList(4, 1))
        );
        assertEquals(Arrays.asList(6, 4), result);
    }

    @Test
    public void testEqualSizeWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 8)),
                new ArrayList<>(Arrays.asList(1, 2))
        );
        assertEquals(Arrays.asList(1, 1, 0), result); // 98 + 12 = 110
    }

    @Test
    public void testDifferentSizeWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9)),
                new ArrayList<>(Arrays.asList(1))
        );
        assertEquals(Arrays.asList(1, 0, 0), result); // 99 + 1 = 100
    }

    @Test
    public void testSingleDigitNoCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(2)),
                new ArrayList<>(Arrays.asList(5))
        );
        assertEquals(Arrays.asList(7), result);
    }

    @Test
    public void testSingleDigitWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(7)),
                new ArrayList<>(Arrays.asList(5))
        );
        assertEquals(Arrays.asList(1, 2), result); // 7 + 5 = 12
    }
}
