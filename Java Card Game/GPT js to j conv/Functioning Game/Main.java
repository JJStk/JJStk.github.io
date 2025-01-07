import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand hand1 = new Hand();
        hand1.addCards(deck.deal(5));

        Hand hand2 = new Hand();
        hand2.addCards(deck.deal(5));

        Hand hand3 = new Hand();
        hand3.addCards(deck.deal(5));

        System.out.println("Hand 1: " + hand1.getHandString());
        System.out.println("Hand 2: " + hand2.getHandString());
        System.out.println("Hand 3: " + hand3.getHandString());

        System.out.println("Comparison of Hand 1 vs Hand 2: " + compareHands(hand1.getCards(), hand2.getCards()));
        System.out.println("Comparison of Hand 1 vs Hand 3: " + compareHands(hand1.getCards(), hand3.getCards()));
        System.out.println("Comparison of Hand 2 vs Hand 3: " + compareHands(hand2.getCards(), hand3.getCards()));
    }

    private static String compareHands(List<Card> hand1, List<Card> hand2) {
        int rank1 = evaluateHand(hand1);
        int rank2 = evaluateHand(hand2);

        if (rank1 > rank2) {
            return "Hand 1 wins";
        } else if (rank1 < rank2) {
            return "Hand 2 wins";
        } else {
            return "It's a tie!";
        }
    }

    private static int evaluateHand(List<Card> hand) {
        Map<String, Integer> rankCounts = new HashMap<>();
        Map<String, Integer> suitCounts = new HashMap<>();

        for (Card card : hand) {
            rankCounts.put(card.getRank(), rankCounts.getOrDefault(card.getRank(), 0) + 1);
            suitCounts.put(card.getSuit(), suitCounts.getOrDefault(card.getSuit(), 0) + 1);
        }

        boolean isFlush = suitCounts.values().stream().anyMatch(count -> count >= 5);

        List<Integer> rankValues = new ArrayList<>();
        for (Card card : hand) {
            rankValues.add(rankValue(card.getRank()));
        }
        Collections.sort(rankValues);

        boolean isStraight = rankValues.size() >= 5 && (rankValues.get(4) - rankValues.get(0) == 4);

        List<Integer> counts = new ArrayList<>(rankCounts.values());
        Collections.sort(counts, Collections.reverseOrder());

        if (isFlush && isStraight) return 8; // Straight Flush
        if (counts.get(0) == 4) return 7;   // Four of a Kind
        if (counts.get(0) == 3 && counts.size() > 1 && counts.get(1) == 2) return 6; // Full House
        if (isFlush) return 5;              // Flush
        if (isStraight) return 4;           // Straight
        if (counts.get(0) == 3) return 3;   // Three of a Kind
        if (counts.get(0) == 2 && counts.size() > 1 && counts.get(1) == 2) return 2; // Two Pair
        if (counts.get(0) == 2) return 1;   // Pair
        return 0;                           // High Card
    }

    private static int rankValue(String rank) {
        switch (rank) {
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": return 10;
            case "Jack": return 11;
            case "Queen": return 12;
            case "King": return 13;
            case "Ace": return 14;
            default: return 0;
        }
    }
}
