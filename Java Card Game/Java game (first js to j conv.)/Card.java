public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getCardString() {
        return this.rank + " of " + this.suit;
    }
}

