package edu.fernando.tdd.int2lcd;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        IntToLcd int2lcd = new IntToLcd();
        int randomNum = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
        String[] numberArrayString = int2lcd.convertIntegerToArrayOfStrings(randomNum);
        for (String text: numberArrayString) {
            System.out.println(text);
        }
    }

}

