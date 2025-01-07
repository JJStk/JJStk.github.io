// File: js/Card.js
class Card {
    constructor(rank, suit) {
        this.rank = rank;
        this.suit = suit;
    }
    get cardString() {
        return `${this.rank} of ${this.suit}`;
    }
}

