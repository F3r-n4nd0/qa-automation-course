package edu.fernando.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

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
        Assert.assertArrayEquals(expected, arrayStringOne);
    }

    @Test
    public void testGivenIntegerTwoToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringTwo = intToLcs.convertIntegerToArrayOfStrings(2);
        String[] expected = new String[] {
                " _ ",
                " _|",
                "|_ "
        };
        Assert.assertArrayEquals(expected, arrayStringTwo);
    }

    @Test
    public void testGivenIntegerThreeToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringThree = intToLcs.convertIntegerToArrayOfStrings(3);
        String[] expected = new String[] {
                "_ ",
                "_|",
                "_|"
        };
        Assert.assertArrayEquals(expected, arrayStringThree);
    }

    @Test
    public void testGivenIntegerFourToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringFour = intToLcs.convertIntegerToArrayOfStrings(4);
        String[] expected = new String[] {
                "   ",
                "|_|",
                "  |"
        };
        Assert.assertArrayEquals(expected, arrayStringFour);
    }

    @Test
    public void testGivenIntegerFiveToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringFive = intToLcs.convertIntegerToArrayOfStrings(5);
        String[] expected = new String[] {
                " _ ",
                "|_ ",
                " _|"
        };
        Assert.assertArrayEquals(expected, arrayStringFive);
    }

    @Test
    public void testGivenIntegerSixToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringSix = intToLcs.convertIntegerToArrayOfStrings(6);
        String[] expected = new String[] {
                " _ ",
                "|_ ",
                "|_|"
        };
        Assert.assertArrayEquals(expected, arrayStringSix);
    }

    @Test
    public void testGivenIntegerSevenToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringSeven = intToLcs.convertIntegerToArrayOfStrings(7);
        String[] expected = new String[] {
                "_ ",
                " |",
                " |"
        };
        Assert.assertArrayEquals(expected, arrayStringSeven);
    }

    @Test
    public void testGivenIntegerEightToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringEight = intToLcs.convertIntegerToArrayOfStrings(8);
        String[] expected = new String[] {
                " _ ",
                "|_|",
                "|_|"
        };
        Assert.assertArrayEquals(expected, arrayStringEight);
    }

    @Test
    public void testGivenIntegerNineToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringNine = intToLcs.convertIntegerToArrayOfStrings(9);
        String[] expected = new String[] {
                " _ ",
                "|_|",
                " _|"
        };
        Assert.assertArrayEquals(expected, arrayStringNine);
    }

    @Test
    public void testGivenIntegerZeroToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        String[] arrayStringZero = intToLcs.convertIntegerToArrayOfStrings(0);
        String[] expected = new String[] {
                " _ ",
                "| |",
                "|_|"
        };
        Assert.assertArrayEquals(expected, arrayStringZero);
    }


    @Test
    public void testConvertLargeIntegerIntoArrayOfIndividualDigits() {
        IntToLcd intToLcs = new IntToLcd();
        int[] arrayIndividualDigits = intToLcs.convertIntegerToArrayOfIndividualDigits(123456789);
        int[] expected = new int[] {1,2,3,4,5,6,7,8,9};
        Assert.assertArrayEquals(expected, arrayIndividualDigits);
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
        Assert.assertArrayEquals(expected, result);
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
        Assert.assertArrayEquals(expected, arrayStringOne);
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
        Assert.assertArrayEquals(expected, arrayStringOne);
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
        Assert.assertArrayEquals(expected, arrayStringOne);
    }

    @Test
    public void testGivenIntegerTwoWithHeightTwoAndWidthThreeToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        int height = 2;
        int width = 3;
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(2 , height, width);
        String[] expected = new String[] {
                " ___ ",
                "    |",
                " ___|",
                "|    ",
                "|___ "
        };
        Assert.assertArrayEquals(expected, arrayStringOne);
    }

    @Test
    public void testConvertLargeIntegerToLargeArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        int height = 2;
        int width = 3;
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(217, height, width);
        String[] expected = new String[] {
                "  ___    ___  ",
                "     | |    | ",
                "  ___| |    | ",
                " |     |    | ",
                " |___  |    | "
        };
        Assert.assertArrayEquals(expected, arrayStringOne);
    }

    @Test
    public void testGivenIntegerThreeWithHeightTwoAndWidthThreeToArrayOfStrings() {
        IntToLcd intToLcs = new IntToLcd();
        int height = 2;
        int width = 3;
        String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(3 , height, width);
        String[] expected = new String[] {
                "___ ",
                "   |",
                "___|",
                "   |",
                "___|"
        };
        Assert.assertArrayEquals(expected, arrayStringOne);
    }

    @Test
    public void testConvertLargeIntegerWithInvalidHeight() {
        IntToLcd intToLcs = new IntToLcd();
        int invalidHeight = 0;
        int width = 3;
        try {
            String[] arrayStringOne = intToLcs.convertIntegerToArrayOfStrings(217, invalidHeight, width);
            fail( "Is a invalid height 0");
        } catch (Exception e) {
            Assert.assertEquals("Invalid Height 0", e.getMessage());
        }
    }

}
