package Task03CardsWithPower;

public enum CardSuits {
    CLUBS("CLUBS", 0),
    DIAMONDS("DIAMONDS", 13),
    HEARTS("HEARTS", 26),
    SPADES("SPADES", 39);

    String name;
    int suitPower;

    CardSuits(String name, int suitPower) {
        this.name = name;
        this.suitPower = suitPower;
    }

    public String getName() {
        return name;
    }

    public int getSuitPower() {
        return suitPower;
    }
}
