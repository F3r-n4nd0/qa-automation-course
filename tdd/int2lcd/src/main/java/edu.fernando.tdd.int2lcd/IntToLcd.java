package edu.fernando.tdd.int2lcd;

public class IntToLcd {

    public String[] convertIntegerToArrayOfStrings(int number) {
        if (number == 1) {
            return new String[] {"","|","|"};
        }
        return new String[0];
    }
}
