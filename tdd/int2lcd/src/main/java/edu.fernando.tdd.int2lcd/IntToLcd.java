package edu.fernando.tdd.int2lcd;

public class IntToLcd {

    public String[] convertIntegerToArrayOfStrings(int number) throws Exception {
        int defaultHeight = 1;
        int defaultWidth = 1;
        return convertIntegerToArrayOfStrings(number,defaultHeight,defaultWidth);
    }

    public String[] convertIntegerToArrayOfStrings(int number, int height, int width) throws Exception {

        if (height <= 0) {
            throw new Exception("Invalid Height " + height);
        }

        if (width <= 0) {
            throw new Exception("Invalid Width " + width);
        }

        if (number > 9) {
            int[] individualDigits = convertIntegerToArrayOfIndividualDigits(number);
            String[] result = new String[1+(height*2)];
            for (int singleNumber: individualDigits) {
                String[] arrayStringDigit = convertIntegerToArrayOfStrings(singleNumber, height, width);
                result = mergeTwoArraysOfString(result,arrayStringDigit);
            }
            result = mergeTwoArraysOfString(result,new String[1+(height*2)]);
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
        arrayStringDigit = convertArrayStringDigitWithHeight(arrayStringDigit, height);
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
            String firstDigit = firstArray[index] == null ? "" :  firstArray[index];
            String secondDigit = secondArray[index] == null ? "" :  secondArray[index];
            arrayMerged[index] = firstDigit + " " + secondDigit;
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

    public String[] convertArrayStringDigitWithHeight(String[] arrayStringDigit, int height) {
        if (height == 1) {
            return arrayStringDigit;
        }
        int len =  arrayStringDigit.length;
        int newTotalHeight = 1 + (height * 2);
        String[] arrayConverted = new String[newTotalHeight];
        arrayConverted[0] =  arrayStringDigit[0];
        int totalIndex = 1;
        for (int index = 0; index < height -1; index++) {
            arrayConverted[totalIndex] = removeMiddle(arrayStringDigit[1]);
            totalIndex++;
        }
        arrayConverted[totalIndex] = arrayStringDigit[1];
        totalIndex++;
        for (int index = 0; index < height -1; index++) {
            arrayConverted[totalIndex] = removeMiddle(arrayStringDigit[2]);
            totalIndex++;
        }
        arrayConverted[totalIndex] = arrayStringDigit[2];
        return arrayConverted;
    }

    private String addWidth(String text, int width) {
        char[] chars = text.toCharArray();
        int originalLen = chars.length;
        if (width == 1 || originalLen == 1) {
            return text;
        }
        char[] newChars = new char[width + (originalLen - 1)];
        switch (originalLen) {
            case 2:
                for (int index = 0; index < width; index++) {
                    newChars[index] = chars[0];
                }
                newChars[width] = chars[1];
                break;
            case 3:
                newChars[0] = chars[0];
                for (int index = 0; index < width; index++) {
                    newChars[index + 1] = chars[1];
                }
                newChars[width+1] = chars[2];
                break;
        }
        return String.valueOf(newChars);
    }

    private String removeMiddle(String text) {
        char[] chars = text.toCharArray();
        int originalLen = chars.length;
        switch (originalLen) {
            case 2:
                for (int index = 0; index < originalLen -1; index++) {
                    chars[index] = " ".charAt(0);
                }
                break;
            case 3:
                for (int index = 1; index < originalLen -1; index++) {
                    chars[index] = " ".charAt(0);
                }
                break;
        }
        return  String.valueOf(chars);
    }

}
