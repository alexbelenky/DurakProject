public class Opponent {
    private String[] opponentCards;

    public Opponent(String[] opponentCards) {
        this.opponentCards = opponentCards;
    }

    public String[] getPlayerCards() {
        return opponentCards;
    }
}
