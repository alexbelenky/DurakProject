public class Opponent {
    private String[] opponentCards;

    public Opponent(String[] opponentCards) {
        this.opponentCards = opponentCards;
    }

    public String[] getOpponentCards() {
        return opponentCards;
    }

    public int getNumberOfOppCards() {
        int amountOfCards = 0;
        for (String card : opponentCards) {
            if (CardLogic.notEmpty(card)) {
                amountOfCards++;
            }
        }
        return amountOfCards;
    }

    private void addCard(String card) {
        for (int i = 0; i < opponentCards.length; i++) {
            if (opponentCards[i].equals("mt")) {
                opponentCards[i] = card;
                break;
            }
        }
    }

    public void removeCardFromOpponent(String card) {
        for (int i = 0; i < opponentCards.length; i++) {
            if (opponentCards[i].equals(card)) {
                opponentCards[i] = "mt";
                break;
            }
        }
    }

    public String opponentAttack() {
        String card = opponentCards[(int) (getNumberOfOppCards() * Math.random())];
        while (!(CardLogic.notEmpty(card))) {
            card = opponentCards[(int) (getNumberOfOppCards() * Math.random())];
        }
        removeCardFromOpponent(card);
        return card;
    }

    public String opponentDefend(String card) {
        try {
            for (String oppCard : opponentCards) {

                String oppTypeCard = oppCard.substring(0, 1);
                int oppNumberOfCard = CardLogic.returnAsValue(oppCard);
                String typeCard = card.substring(0, 1);
                int numberOfCard = CardLogic.returnAsValue(card);
                if (oppTypeCard.equals(typeCard) && (oppNumberOfCard > numberOfCard)) {
                    Card.turn = false;
                    return String.format("%sThe opponent defends with: %s%s", Color.BLUE, Color.RESET, Card.colorCard(oppCard));
                }
            }
            for (String oppCard : opponentCards) {
                String oppTypeCard = oppCard.substring(0, 1);
                int oppNumberOfCard = CardLogic.returnAsValue(oppCard);
                String typeCard = card.substring(0, 1);
                int numberOfCard = CardLogic.returnAsValue(card);

                if (oppTypeCard.equals(Card.kozer.substring(0, 1)) && typeCard.equals(Card.kozer.substring(0, 1))) {
                    if (oppNumberOfCard > numberOfCard) {
                        Card.turn = false;
                        return String.format("%sThe opponent defends with: %s%s", Color.BLUE, Color.RESET, Card.colorCard(oppCard));
                    }
                } else if (oppTypeCard.equals(Card.kozer.substring(0, 1))) {
                    Card.turn = false;
                    return String.format("%sThe opponent defends with: %s%s", Color.BLUE, Color.RESET, Card.colorCard(oppCard));
                }
            }
        } catch (Exception ignored) {

        }
        addCard(card);
        Card.turn = true;
        return String.format("%sThe opponent takes the %s%s!\n", Color.CYAN, Color.RESET, Card.colorCard(card));
    }
}
