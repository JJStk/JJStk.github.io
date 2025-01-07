// File: js/Hand.js
class Hand extends Deck {
    constructor() {
        super();  // Calls the constructor of the Deck class
        this.cards = [];  // Player's hand is initially empty
    }

    addCards(cards) {
        this.cards = this.cards.concat(cards);
    }

    get handString() {
        return this.cards.map(card => card.cardString).join(', ');
    }
}
