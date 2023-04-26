package Task01CardSuit;

import java.util.Scanner;

    /**
     * Create an enumeration type that has as its constants the four suits of a deck of playing cards
     * (CLUBS, DIAMONDS, HEARTS, SPADES).
     * Iterate over the values of the enumeration type and print all ordinal values and names.
     *
     * @author Anton Hristov
     * @since 08.12.2022
     * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.equals("Card Suits")) {
           CardSuits.CLUBS.printRequiredData();
        }
        scanner.close();
    }
}
