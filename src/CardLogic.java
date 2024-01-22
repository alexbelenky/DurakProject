public class CardLogic {
    private String[] cards;

    public CardLogic() {
        cards = new String[]{"h6", "h7", "h8", "h9", "h10", "hJ", "hQ", "hK", "hA", "c6", "c7", "c8", "c9", "c10", "cJ", "cQ", "cK", "cA", "d6", "d7", "d8", "d9", "d10", "dJ", "dQ", "dK", "dA", "s6", "s7", "s8", "s9", "s10", "sJ", "sQ", "sK", "sA"};
    }

    public String[] getCards() {
        return cards;
    }

    public void setCards(String[] cards) {
        this.cards = cards;
    }

    //gives cards and removes them from pile. "mt" stands for empty
    public String[] setCards() {
        String[] playerCards = new String[36];
        for (int i = 0; i < 6; i++) {
            String card = cards[(int) (cards.length * Math.random())];
            playerCards[i] = card;
            removeCard(card);
        }
        for (int i = 6; i < 36; i++) {
            playerCards[i] = "mt";
        }
        return playerCards;
    }

    //gives Kozer
    public String setKozer() {
        String kozer = cards[(int) (cards.length * Math.random())];
        removeCard(kozer);
        return kozer;
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

    //returns true if not empty
    public static boolean notEmpty(String card) {
        return !(card.equals("mt"));
    }

    //returns the name of the card. For example: h6 would be Sixes of hearts
    public static String cardInWords(String card) {
        return switch (card) {
            case "mt" -> "Empty";
            case "h6" -> "Sixes of Hearts";
            case "h7" -> "Sevens of Hearts";
            case "h8" -> "Eights of Hearts";
            case "h9" -> "Nines of Hearts";
            case "h10" -> "Tens of Hearts";
            case "hJ" -> "Jack of Hearts";
            case "hQ" -> "Queen of Hearts";
            case "hK" -> "Kings of Hearts";
            case "hA" -> "Ace of Hearts";
            case "c6" -> "Sixes of Clubs";
            case "c7" -> "Sevens of Clubs";
            case "c8" -> "Eights of Clubs";
            case "c9" -> "Nines of Clubs";
            case "c10" -> "Tens of Clubs";
            case "cJ" -> "Jack of Clubs";
            case "cQ" -> "Queen of Clubs";
            case "cK" -> "King of Clubs";
            case "cA" -> "Ace of Clubs";
            case "d6" -> "Sixes of Diamonds";
            case "d7" -> "Sevens of Diamonds";
            case "d8" -> "Eights of Diamonds";
            case "d9" -> "Nines of Diamonds";
            case "d10" -> "Tens of Diamonds";
            case "dJ" -> "Jack of Diamonds";
            case "dQ" -> "Queen of Diamonds";
            case "dK" -> "King of Diamonds";
            case "dA" -> "Ace of Diamonds";
            case "s6" -> "Sixes of Spades";
            case "s7" -> "Sevens of Spades";
            case "s8" -> "Eights of Spades";
            case "s9" -> "Nines of Spades";
            case "s10" -> "Tens of Spades";
            case "sJ" -> "Jack of Spades";
            case "sQ" -> "Queen of Spades";
            case "sK" -> "King of Spades";
            case "sA" -> "Ace of Spades";
            default -> card;
        };
    }
}
