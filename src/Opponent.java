public class Opponent {
    private String[] opponentCards;

    public Opponent(String[] opponentCards) {
        this.opponentCards = opponentCards;
    }

    public String[] getOpponentCards() {
        return opponentCards;
    }

    public String opponentDefend(String card) {
        try {
            for (String oppCard : opponentCards) {

                String oppTypeCard = oppCard.substring(0, 1);
                int oppNumberOfCard = CardLogic.returnAsValue(oppCard);
                String typeCard = card.substring(0, 1);
                int numberOfCard = CardLogic.returnAsValue(card);
                System.out.println(oppCard);
                System.out.println(card);
                if (oppTypeCard.equals(typeCard) && (oppNumberOfCard > numberOfCard)) {
                    return oppCard;
                }
            }
            for (String oppCard : opponentCards) {
                String oppTypeCard = oppCard.substring(0, 1);
                int oppNumberOfCard = CardLogic.returnAsValue(oppCard);
                String typeCard = card.substring(0, 1);
                int numberOfCard = CardLogic.returnAsValue(card);

                if (oppTypeCard.equals(Card.kozer.substring(0, 1)) && typeCard.equals(Card.kozer.substring(0, 1))) {
                    if (oppNumberOfCard > numberOfCard) {
                        return oppCard;
                    }
                } else if (oppTypeCard.equals(Card.kozer.substring(0, 1))) {
                    return oppCard;
                }
            }
        } catch (Exception ignored) {

        }
        return "no lol";
    }
}
