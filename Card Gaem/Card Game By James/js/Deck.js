// File: js/Deck.js
class Deck {
    constructor() {
        this.suits = ['Hearts', 'Diamonds', 'Clubs', 'Spades'];
        this.ranks = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'Jack', 'Queen', 'King', 'Ace'];
        this.cards = [];
        this.buildDeck();
    }

    buildDeck() {
        for (let suit of this.suits) {
            for (let rank of this.ranks) {
                this.cards.push(new Card(rank, suit));
            }
        }
    }

    shuffle() {
        for (let i = this.cards.length - 1; i > 0; i--) {
            const j = Math.floor(Math.random() * (i + 1));
            [this.cards[i], this.cards[j]] = [this.cards[j], this.cards[i]];
        }
    }

    deal(numCards) {
        return this.cards.splice(0, numCards);
    }
}

