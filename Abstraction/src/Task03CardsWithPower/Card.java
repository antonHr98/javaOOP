package Task03CardsWithPower;

public class Card {
    String inputSuit;
    String inputRank;

    public Card(String inputSuit, String inputRank) {
        this.inputSuit = inputSuit;
        this.inputRank = inputRank;
    }

    public void printOutputFormat() {
        System.out.printf("Card name: %s of %s; Card power: %d\n",inputRank, inputSuit, cardPower());
    }

    public int cardPower() {
        int suitPower = (CardSuits.valueOf(inputSuit)).getSuitPower();
        int rankPower = (CardRanks.valueOf(inputRank)).getRankPower();
        return suitPower + rankPower;
    }
}
