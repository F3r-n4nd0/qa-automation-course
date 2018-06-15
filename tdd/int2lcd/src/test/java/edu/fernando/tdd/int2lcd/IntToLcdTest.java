package edu.fernando.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class IntToLcdTest {

    @Test
    public void testGivenIntegerOneToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerTwoToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerThreeToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerFourToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerFiveToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerSixToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerSevenToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerEightToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerNineToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerZeroToArrayOfStrings() throws Exception {
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
    public void testConvertLargeIntegerToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerTwoWithWidthThreeToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerTwoWithHeightTwoToArrayOfStrings() throws Exception {
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
    public void testGivenIntegerTwoWithHeightTwoAndWidthThreeToArrayOfStrings() throws Exception {
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
    public void testConvertLargeIntegerToLargeArrayOfStrings() throws Exception {
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
    public void testGivenIntegerThreeWithHeightTwoAndWidthThreeToArrayOfStrings() throws Exception {
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
