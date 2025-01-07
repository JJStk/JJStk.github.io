// File: js/main.js
// Utility functions
function rankValue(rank) {
    if (rank === 'Ace') return 14;
    if (rank === 'King') return 13;
    if (rank === 'Queen') return 12;
    if (rank === 'Jack') return 11;
    return parseInt(rank);
}

function evaluateHand(hand) {
    const counts = {};
    let suitsCount = {};
    hand.forEach(card => {
        counts[card.rank] = (counts[card.rank] || 0) + 1;
        suitsCount[card.suit] = (suitsCount[card.suit] || 0) + 1;
    });

    // Check for flush
    const isFlush = Object.values(suitsCount).some(count => count >= 5);

    // Check for straight
    const sortedRanks = hand.map(card => rankValue(card.rank)).sort((a, b) => a - b);
    const isStraight = sortedRanks[4] - sortedRanks[0] === 4 && new Set(sortedRanks).size === 5;

    // Check for pairs, three of a kind, four of a kind
    const groupedByCount = Object.values(counts);
    const isFourOfAKind = groupedByCount.includes(4);
    const isThreeOfAKind = groupedByCount.includes(3);
    const isTwoPair = groupedByCount.filter(count => count === 2).length === 2;
    const isPair = groupedByCount.includes(2);

    if (isFlush && isStraight) return 'Straight Flush';
    if (isFourOfAKind) return 'Four of a Kind';
    if (isFlush) return 'Flush';
    if (isStraight) return 'Straight';
    if (isThreeOfAKind) return 'Three of a Kind';
    if (isTwoPair) return 'Two Pair';
    if (isPair) return 'Pair';
    return 'High Card';
}

function compareHands(hand1, hand2) {
    const handRanks = ['High Card', 'Pair', 'Two Pair', 'Three of a Kind', 'Straight', 'Flush', 'Full House', 'Four of a Kind', 'Straight Flush'];

    const hand1Rank = evaluateHand(hand1);
    const hand2Rank = evaluateHand(hand2);

    if (handRanks.indexOf(hand1Rank) > handRanks.indexOf(hand2Rank)) {
        return 'Hand 1 wins';
    } else if (handRanks.indexOf(hand1Rank) < handRanks.indexOf(hand2Rank)) {
        return 'Hand 2 wins';
    } else {
        return 'It\'s a tie!';
    }
}

// Shuffle and deal hands
function startGame() {
    const deck = new Deck();
    deck.shuffle();

    const hand1 = new Hand();
    hand1.addCards(deck.deal(5));
    const hand2 = new Hand();
    hand2.addCards(deck.deal(5));
    const hand3 = new Hand();
    hand3.addCards(deck.deal(5));

    displayHands(hand1, hand2, hand3);
    displayResult(hand1, hand2, hand3);
}

// Display hands on the web page
function displayHands(hand1, hand2, hand3) {
    const handsContainer = document.getElementById("hands-container");
    handsContainer.innerHTML = ''; // Clear previous hands

    function renderHand(hand, handNumber) {
        let handDiv = document.createElement('div');
        handDiv.classList.add('hand');
        handDiv.innerHTML = `<h3>Hand ${handNumber}: ${hand.handString}</h3>`;

        hand.cards.forEach(card => {
            const cardDiv = document.createElement('div');
            cardDiv.classList.add('card');
            cardDiv.textContent = card.cardString;
            handDiv.appendChild(cardDiv);
        });

        handsContainer.appendChild(handDiv);
    }

    renderHand(hand1, 1);
    renderHand(hand2, 2);
    renderHand(hand3, 3);
}

// Display result of hand comparisons
function displayResult(hand1, hand2, hand3) {
    const resultDiv = document.getElementById("result");
    const result1vs2 = compareHands(hand1.cards, hand2.cards);
    const result1vs3 = compareHands(hand1.cards, hand3.cards);
    const result2vs3 = compareHands(hand2.cards, hand3.cards);

    resultDiv.innerHTML = `
        <p>Comparison of Hand 1 vs Hand 2: ${result1vs2}</p>
        <p>Comparison of Hand 1 vs Hand 3: ${result1vs3}</p>
        <p>Comparison of Hand 2 vs Hand 3: ${result2vs3}</p>
    `;
}

// Start the game on page load
startGame();

