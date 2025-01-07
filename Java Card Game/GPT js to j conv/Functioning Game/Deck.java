import java.util.*;

public class Deck {
    private List<Card> cards;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        cards = new ArrayList<>();
        buildDeck();
    }

    private void buildDeck() {
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> deal(int numCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numCards && !cards.isEmpty(); i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }
}
