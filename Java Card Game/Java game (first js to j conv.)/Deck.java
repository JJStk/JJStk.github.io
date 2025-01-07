import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    String rank;
    String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
}

public class Deck {
    private List<String> suits;
    private List<String> ranks;
    private List<Card> cards;

    public Deck() {
        this.suits = new ArrayList<>(List.of("Hearts", "Diamonds", "Clubs", "Spades"));
        this.ranks = new ArrayList<>(List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));
        this.cards = new ArrayList<>();
        buildDeck();
    }

    private void buildDeck() {
        for (String suit : this.suits) {
            for (String rank : this.ranks) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public List<Card> deal(int numCards) {
        List<Card> dealtCards = new ArrayList<>(this.cards.subList(0, numCards));
        this.cards.subList(0, numCards).clear();
        return dealtCards;
    }
}

