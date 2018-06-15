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

    @Test
    public void testGivenIntegerEightToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(8);
        String[] expected = new String[] {
                " _ ",
                "|_|",
                "|_|"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerNineToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(9);
        String[] expected = new String[] {
                " _ ",
                "|_|",
                " _|"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerZeroToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(0);
        String[] expected = new String[] {
                " _ ",
                "| |",
                "|_|"
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }


    @Test
    public void testConvertLargeIntegerIntoArrayOfIndividualDigits() {
        IntToLcd intToLcs = new IntToLcd();
        int[] arrayIndividualDigits = intToLcs.convertIntegerToArrayOfIndividualDigits(123456789);
        int[] expected = new int[] {1,2,3,4,5,6,7,8,9};
        Assert.assertArrayEquals(arrayIndividualDigits, expected);
    }

    @Test
    public void testMergeTwoArrayOfString() {
        IntToLcd intToLcs = new IntToLcd();
        String[] firstArray = new String[] {
                " ",
                "|",
                "|"
        };
        String[] secondArray = new String[] {
                " _ ",
                " _|",
                "|_ "
        };
        String[] result = intToLcs.mergeTwoArraysOfString(firstArray, secondArray);
        String[] expected = new String[] {
                "   _ ",
                "|  _|",
                "| |_ "
        };
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void testConvertLargeIntegerToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(123456789);
        String[] expected = new String[] {
                "    _  _       _   _  _   _   _  ",
                " |  _| _| |_| |_  |_   | |_| |_| ",
                " | |_  _|   |  _| |_|  | |_|  _| "
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerTwoWithWidthThreeToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        int height = 1;
        int width = 3;
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(2 , height, width);
        String[] expected = new String[] {
                " ___ ",
                " ___|",
                "|___ "
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }

    @Test
    public void testGivenIntegerTwoWithHeightTwoToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        int height = 2;
        int width = 1;
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(2 , height, width);
        String[] expected = new String[] {
                " _ ",
                "  |",
                " _|",
                "|  ",
                "|_ "
        };
        Assert.assertArrayEquals(arrayStringOne, expected);
    }
}
