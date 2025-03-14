import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Hand extends Deck {
    private List<Card> cards;

    public Hand() {
        super();  // Calls the constructor of the Deck class
        this.cards = new ArrayList<>();  // Player's hand is initially empty
    }

    public void addCards(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public String getHandString() {
        return this.cards.stream()
                         .map(card -> card.getCardString())
                         .collect(Collectors.joining(", "));
    }
}

