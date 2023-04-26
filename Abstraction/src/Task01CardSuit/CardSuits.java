package Task01CardSuit;

public enum CardSuits {

    CLUBS("CLUBS", 0),
    DIAMONDS("DIAMONDS", 1),
    HEARTS("HEARTS", 2),
    SPADES("SPADES", 3);
    String name;
    int ordinalValue;

    CardSuits(String name, int ordinalValue) {
        this.name = name;
        this.ordinalValue = ordinalValue;
    }

    public String getName() {
        return this.name;
    }

    public int getOrdinalValue() {
        return ordinalValue;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s\n", getOrdinalValue(), getName());
    }

    public void printRequiredData() {
        System.out.println("Card Suits:");
        for (CardSuits card : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", card.getOrdinalValue(), card.getName());
        }
    }
}
