package Task03CardsWithPower;

public enum CardRanks {
    ACE("ACE", 14),
    KING("KING", 13),
    QUEEN("QUEEN", 12),
    JACK("JACK", 11),
    TEN("TEN", 10),
    NINE("NINE", 9),
    EIGHT("EIGHT", 8),
    SEVEN("SEVEN", 7),
    SIX("SIX", 6),
    FIVE("FIVE", 5),
    FOUR("FOUR", 4),
    THREE("THREE", 3),
    TWO("TWO", 2);

    String name;
    int rankPower;

    CardRanks(String name, int value) {
        this.name = name;
        this.rankPower = value;
    }

    public String getName() {
        return name;
    }

    public int getRankPower() {
        return rankPower;
    }
}
