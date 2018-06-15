package edu.fernando.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

public class IntToLcdTest {

    @Test
    public void testGivenIntegerOneToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(1);
        String[] expected = new String[] {
                " ",
                "|",
                "|"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerTwoToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(2);
        String[] expected = new String[] {
                " _ ",
                " _|",
                "|_ "
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerThreeToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(3);
        String[] expected = new String[] {
                "_ ",
                "_|",
                "_|"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerFourToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(4);
        String[] expected = new String[] {
                "   ",
                "|_|",
                "  |"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerFiveToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(5);
        String[] expected = new String[] {
                " _ ",
                "|_ ",
                " _|"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerSixToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(6);
        String[] expected = new String[] {
                " _ ",
                "|_ ",
                "|_|"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerSevenToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(7);
        String[] expected = new String[] {
                "_ ",
                " |",
                " |"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

}
