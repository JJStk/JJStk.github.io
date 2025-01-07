import java.util.*;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }

    public String getHandString() {
        StringBuilder handString = new StringBuilder();
        for (Card card : cards) {
            handString.append(card.getCardString()).append(", ");
        }
        return handString.length() > 0 ? handString.substring(0, handString.length() - 2) : "";
    }

    public List<Card> getCards() {
        return cards;
    }
}
