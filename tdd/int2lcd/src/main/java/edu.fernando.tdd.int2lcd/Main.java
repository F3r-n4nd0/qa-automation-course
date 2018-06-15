package edu.fernando.tdd.int2lcd;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws Exception {
        IntToLcd int2lcd = new IntToLcd();
        int randomNum = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
        String[] numberArrayString = int2lcd.convertIntegerToArrayOfStrings(randomNum);
        for (String text: numberArrayString) {
            System.out.println(text);
        }
        System.out.println("Large Number");
        int randomHeight = ThreadLocalRandom.current().nextInt(1, 7);
        int randomWidth = ThreadLocalRandom.current().nextInt(1, 7);
        String[] numberArrayStringLarge = int2lcd.convertIntegerToArrayOfStrings(randomNum,randomHeight,randomWidth);
        for (String text: numberArrayStringLarge) {
            System.out.println(text);
        }
    }

}

