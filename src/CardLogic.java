public class CardLogic {
    private String[] cards;

    public CardLogic() {
        cards = new String[]{"h6", "h7", "h8", "h9", "h10", "hJ", "hQ", "hK", "hA", "c6", "c7", "c8", "c9", "c10", "cJ", "cQ", "cK", "cA", "d6", "d7", "d8", "d9", "d10", "dJ", "dQ", "dK", "dA", "s6", "s7", "s8", "s9", "s10", "sJ", "sQ", "sK", "sA" };
    }

    public String[] getCards() {
        return cards;
    }

    public void setCards(String[] cards) {
        this.cards = cards;
    }

    public void setPlayerCards() {
        for (int i = 0; i < 6; i++) {

        }
    }

    //removes a certain card from the pile of cards
    public void removeCard(String rCard) {
        String[] newCards = new String[cards.length - 1];
        for (int i = 0, j = 0; i < cards.length - 1; i++, j++) {
            String card = cards[i];
            if (rCard.equals(card)) {
                newCards[i] = cards[j + 1];
                j++;
            } else {
                newCards[i] = cards[j];
            }
        }
        cards = newCards;
    }
}
