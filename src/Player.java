import java.util.HashSet;
import java.util.Set;

public class Player {
    private String[] playerCards;

    private Set<String> cards = new HashSet<>();

    public Player(String[] playerCards) {
        this.playerCards = playerCards;

        for (String card : playerCards) {
            cards.add(card);
        }
    }

    public String[] getPlayerCards() {
        return playerCards;
    }

    public void addCard(String card) {
        cards.add(card);
    }

    public Set<String> getCards() {
        return cards;
    }
}
