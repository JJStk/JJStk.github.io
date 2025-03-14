import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;

// Utility functions
public class PokerGame {

    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("  Welcome to Cards!");
        System.out.println("====================");
        System.out.println("____________________");
        System.out.println("Press enter to begin.");

        Scanner GameStart = new Scanner(System.in);
        GameStart.nextLine();
        GameStart.close();

        startGame();

    }

    public static int rankValue(String rank) {
        switch (rank) {
            case "Ace": return 14;
            case "King": return 13;
            case "Queen": return 12;
            case "Jack": return 11;
            default: return Integer.parseInt(rank);
        }
    }

    public static String evaluateHand(List<Card> hand) {
        Map<String, Integer> counts = new HashMap<>();
        Map<String, Integer> suitsCount = new HashMap<>();

        for (Card card : hand) {
            counts.put(card.rank, counts.getOrDefault(card.rank, 0) + 1);
            suitsCount.put(card.suit, suitsCount.getOrDefault(card.suit, 0) + 1);
        }

        // Check for flush
        boolean isFlush = suitsCount.values().stream().anyMatch(count -> count >= 5);

        // Check for straight
        List<Integer> sortedRanks = hand.stream()
                .map(card -> rankValue(card.rank))
                .sorted()
                .collect(Collectors.toList());
        boolean isStraight = sortedRanks.get(4) - sortedRanks.get(0) == 4 &&
                sortedRanks.stream().distinct().count() == 5;

        // Check for pairs, three of a kind, four of a kind
        List<Integer> groupedByCount = new ArrayList<>(counts.values());
        boolean isFourOfAKind = groupedByCount.contains(4);
        boolean isThreeOfAKind = groupedByCount.contains(3);
        boolean isTwoPair = groupedByCount.stream().filter(count -> count == 2).count() == 2;
        boolean isPair = groupedByCount.contains(2);

        if (isFlush && isStraight) return "Straight Flush";
        if (isFourOfAKind) return "Four of a Kind";
        if (isFlush) return "Flush";
        if (isStraight) return "Straight";
        if (isThreeOfAKind) return "Three of a Kind";
        if (isTwoPair) return "Two Pair";
        if (isPair) return "Pair";
        return "High Card";
    }

    public static String compareHands(List<Card> hand1, List<Card> hand2) {
        List<String> handRanks = Arrays.asList(
                "High Card", "Pair", "Two Pair", "Three of a Kind", "Straight",
                "Flush", "Full House", "Four of a Kind", "Straight Flush");

        String hand1Rank = evaluateHand(hand1);
        String hand2Rank = evaluateHand(hand2);

        if (handRanks.indexOf(hand1Rank) > handRanks.indexOf(hand2Rank)) {
            return "Hand 1 wins";
        } else if (handRanks.indexOf(hand1Rank) < handRanks.indexOf(hand2Rank)) {
            return "Hand 2 wins";
        } else {
            return "It's a tie!";
        }
    }

    // Shuffle and deal hands
    public static void startGame() {
        Deck deck = new Deck();
        deck.shuffle();

        Hand hand1 = new Hand();
        hand1.addCards(deck.deal(5));
        Hand hand2 = new Hand();
        hand2.addCards(deck.deal(5));
        Hand hand3 = new Hand();
        hand3.addCards(deck.deal(5));

        displayHands(hand1, hand2, hand3);
        displayResult(hand1, hand2, hand3);
    }

    // Display hands on the web page
    public static void displayHands(Hand hand1, Hand hand2, Hand hand3) {
        // Assuming there's a method to clear and render hands in a web environment
        // This is a placeholder for the actual implementation
        System.out.println("Displaying hands:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
    }

    // Display result of hand comparisons
    public static void displayResult(Hand hand1, Hand hand2, Hand hand3) {
        String result1vs2 = compareHands(hand1.getCards(), hand2.getCards());
        String result1vs3 = compareHands(hand1.getCards(), hand3.getCards());
        String result2vs3 = compareHands(hand2.getCards(), hand3.getCards());

        System.out.println("Comparison of Hand 1 vs Hand 2: " + result1vs2);
        System.out.println("Comparison of Hand 1 vs Hand 3: " + result1vs3);
        System.out.println("Comparison of Hand 2 vs Hand 3: " + result2vs3);
    }

    
    
}

class Card {
    String rank;
    String suit;
    String cardString;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        this.cardString = rank + " of " + suit;
    }

    @Override
    public String toString() {
        return cardString;
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> deal(int numberOfCards) {
        List<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            dealtCards.add(cards.remove(0));
        }
        return dealtCards;
    }
}

class Hand {
    private List<Card> cards;
    public String handString;

    public Hand() {
        cards = new ArrayList<>();
        handString = "";
    }

    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
        handString = cards.stream().map(Card::toString).collect(Collectors.joining(", "));
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return handString;
    }
}

