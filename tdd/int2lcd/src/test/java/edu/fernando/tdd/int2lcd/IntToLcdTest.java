package edu.fernando.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

public class IntToLcdTest {

    @Test
    public void testGivenIntegerOneToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(1);
        String[] expected = new String[] {"","|","|"};
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

}
