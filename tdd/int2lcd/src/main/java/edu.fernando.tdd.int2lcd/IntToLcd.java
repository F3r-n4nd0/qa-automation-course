package edu.fernando.tdd.int2lcd;

public class IntToLcd {

    public String[] convertIntegerToArrayOfStrings(int number) {
        int defaultHeight = 1;
        int defaultWidth = 1;
        return convertIntegerToArrayOfStrings(number,defaultHeight,defaultWidth);
    }

    public String[] convertIntegerToArrayOfStrings(int number, int height, int width) {
        if (number > 9) {
            int[] individualDigits = convertIntegerToArrayOfIndividualDigits(number);
            String[] result = new String[] {"","",""};
            for (int singleNumber: individualDigits) {
                String[] arrayStringDigit = convertIntegerToArrayOfStrings(singleNumber);
                result = mergeTwoArraysOfString(result,arrayStringDigit);
            }
            result = mergeTwoArraysOfString(result,new String[] {"","",""});
            return result;

        }

        String[] arrayStringDigit;
        switch (number) {
            case 1:
                arrayStringDigit = new String[] {" ","|","|"};
                break;
            case 2:
                arrayStringDigit = new String[] {" _ ", " _|", "|_ "};
                break;
            case 3:
                arrayStringDigit = new String[] {"_ ", "_|", "_|"};
                break;
            case 4:
                arrayStringDigit = new String[] {"   ", "|_|", "  |"};
                break;
            case 5:
                arrayStringDigit = new String[] {" _ ", "|_ ", " _|"};
                break;
            case 6:
                arrayStringDigit = new String[] {" _ ", "|_ ", "|_|"};
                break;
            case 7:
                arrayStringDigit = new String[] {"_ ", " |", " |"};
                break;
            case 8:
                arrayStringDigit = new String[] {" _ ", "|_|", "|_|"};
                break;
            case 9:
                arrayStringDigit = new String[] {" _ ", "|_|", " _|"};
                break;
            case 0:
                arrayStringDigit = new String[] {" _ ", "| |", "|_|"};
                break;
            default:
                arrayStringDigit = new String[0];
                break;
        }

        arrayStringDigit = convertArrayStringDigitWithWidth(arrayStringDigit, width);

        return arrayStringDigit;
    }

    public int[] convertIntegerToArrayOfIndividualDigits(int largeInteger) {
        int len = Integer.toString(largeInteger).length();
        int[] arrayIndividualDigits = new int[len];
        for (int index = (len - 1); index >= 0; index--) {
            arrayIndividualDigits[index] = largeInteger % 10;
            largeInteger /= 10;
        }
        return arrayIndividualDigits;
    }

    public String[] mergeTwoArraysOfString(String[] firstArray, String[] secondArray) {
        int len =  firstArray.length;
        String[] arrayMerged = new String[len];
        for (int index = 0; index < len; index++) {
            arrayMerged[index] = firstArray[index] + " " + secondArray[index];
        }
        return arrayMerged;
    }

    public String[] convertArrayStringDigitWithWidth(String[] arrayStringDigit, int width) {
        int len =  arrayStringDigit.length;
        String[] arrayConverted = new String[len];
        for (int index = 0; index < len; index++) {
            arrayConverted[index] = addWidth(arrayStringDigit[index],width);
        }
        return arrayConverted;
    }

    private String addWidth(String text, int width) {
        char[] chars = text.toCharArray();
        char[] newChars;
        switch (chars.length) {
            case 1:
                return text;
            case 2:
                newChars = new char[width + 1];
                for (int index = 0; index < width; index++) {
                    newChars[index] = chars[0];
                }
                newChars[width] = chars[1];
                return String.valueOf(newChars);
            case 3:
                newChars = new char[width + 2];
                newChars[0] = chars[0];
                for (int index = 0; index < width; index++) {
                    newChars[index + 1] = chars[1];
                }
                newChars[width+1] = chars[2];
                return String.valueOf(newChars);
        }
        return "";
    }

}
