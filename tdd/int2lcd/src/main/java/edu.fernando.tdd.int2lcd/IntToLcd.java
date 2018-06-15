package edu.fernando.tdd.int2lcd;

public class IntToLcd {

    public String[] convertIntegerToArrayOfStrings(int number) {
        switch (number) {
            case 1:
                return new String[] {" ","|","|"};
            case 2:
                return new String[] {" _ ", " _|", "|_ "};
            case 3:
                return new String[] {"_ ", "_|", "_|"};
            case 4:
                return new String[] {"   ", "|_|", "  |"};
            case 5:
                return new String[] {" _ ", "|_ ", " _|"};
            case 6:
                return new String[] {" _ ", "|_ ", "|_|"};
            case 7:
                return new String[] {"_ ", " |", " |"};
            case 8:
                return new String[] {" _ ", "|_|", "|_|"};
            case 9:
                return new String[] {" _ ", "|_|", " _|"};
        }
        return new String[0];
    }
}
