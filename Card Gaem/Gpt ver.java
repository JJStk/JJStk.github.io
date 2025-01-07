public class Main {
// Define the suits and ranks
const suits = ['Hearts', 'Diamonds', 'Clubs', 'Spades'];
const ranks = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'Jack', 'Queen', 'King', 'Ace'];

// Create the deck as an array of card objects
let deck = [];
suits.forEach(suit => {
  ranks.forEach(rank => {
    deck.push({ rank: rank, suit: suit });
  });
});

// Function to shuffle the deck using the Fisher-Yates algorithm
function shuffleDeck(deck) {
  for (let i = deck.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1)); // Random index
    [deck[i], deck[j]] = [deck[j], deck[i]]; // Swap the elements
  }
}

// Shuffle the deck
shuffleDeck(deck);

// Deal 3 hands of 5 cards each
let hand1 = deck.slice(0, 5);
let hand2 = deck.slice(5, 10);
let hand3 = deck.slice(10, 15);

// Display the hands
console.log("Hand 1:", hand1);
console.log("Hand 2:", hand2);
console.log("Hand 3:", hand3);

}
