public class Player {
    private String[] playerCards;

    public Player(String[] playerCards) {
        this.playerCards = playerCards;
    }

    public String[] getPlayerCards() {
        return playerCards;
    }

    public int getNumberOfCards() {
        int amountOfCards = 0;
        for (String card : playerCards) {
            if (CardLogic.notEmpty(card)) {
                amountOfCards++;
            }
        }
        return amountOfCards;
    }

    public void addCard(String card) {
        for (int i = 0; i < playerCards.length; i++) {
            if (playerCards[i].equals("mt")) {
                playerCards[i] = card;
                break;
            }
        }
    }

    //removes card from the deck
    public void removeCardFromPlayer(String card) {
        for (int i = 0; i < playerCards.length; i++) {
            if (playerCards[i].equals(card)) {
                playerCards[i] = "mt";
                break;
            }
        }
    }

    //takes a new card from the deck
    public String takeCardFromDeck(CardLogic cardLogic) {
        for (int i = 0; i < playerCards.length; i++) {
            if (playerCards[i].equals("mt")) {
                String card = cardLogic.getCards()[(int) (cardLogic.getCards().length * Math.random())];
                playerCards[i] = card;
                cardLogic.removeCard(card);
                return card;
            }
        }
        return "mt";
    }


}