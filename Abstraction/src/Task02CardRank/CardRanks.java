package Task02CardRank;

public enum CardRanks {
    ACE("ACE", 0),
    TWO("TWO", 1),
    THREE("THREE", 2),
    FOUR("FOUR", 3),
    FIVE("FIVE", 4),
    SIX("SIX", 5),
    SEVEN("SEVEN", 6),
    EIGHT("EIGHT", 7),
    NINE("NINE", 8),
    TEN("TEN", 9),
    JACK("JACK", 10),
    QUEEN("QUEEN", 11),
    KING("KING", 12);

    String name;
    int value;

    CardRanks(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s\n", getValue(), getName());
    }

    public void printRequiredOutput() {
        System.out.println("Card Ranks:");
        for (CardRanks card : CardRanks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", card.getValue(), card.getName());
        }
    }
}
