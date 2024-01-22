import java.util.Scanner;

public class Card {
    static Scanner scan = new Scanner(System.in);
    static CardLogic cardLogic = new CardLogic();
    static String kozer;
    static boolean turn = true; //true means it is the players turn and false means it is the opponent's
    static boolean game = true; //true means that the game is still on
    static Player player;
    static Opponent opponent;


    public Card() { }

    public static void start() {
        System.out.println(Visual.welcome());
        if (askQuestionL("Are you ready to play!? y/n").equals("y")) {
            setCards();
            System.out.println(Visual.showCards(player));
            System.out.printf("%sThe Kozer is: %s%s", Color.YELLOW, Color.RESET, colorCard(kozer));
            playGame();
        } else {
            System.out.println("Come back later!");
            System.exit(0);
        }
    }

    //sets cards for both player and opponent and picks a kozer
    private static void setCards() {
        String[] playerCards = cardLogic.setCards();
        player = new Player(playerCards);
        String[] opponentCards = cardLogic.setCards();
        opponent = new Opponent(opponentCards);
        kozer = cardLogic.setKozer();
    }

    //shows the player the next options
    private static void playGame() {
        while (game) {
            if (turn) {
                attack();
                System.out.println(Visual.showCards(player));
                System.out.printf("%sThe Kozer is: %s%s", Color.YELLOW, Color.RESET, colorCard(kozer));
            } else {
                String oppCard = opponent.opponentAttack();
                System.out.println(defend(oppCard));
                if (!(player.getNumberOfCards() >= 6)) {
                    System.out.printf("\n%sYou take %s%s%s from the deck!%s\n", Color.PURPLE, Color.RESET, colorCard(player.takeCardFromDeck(cardLogic)), Color.PURPLE, Color.RESET);
                }
                System.out.println(Visual.showCards(player));
                System.out.printf("%sThe Kozer is: %s%s", Color.YELLOW, Color.RESET, colorCard(kozer));
            }

            if (player.getNumberOfCards() == 0) {
                game = false;
                System.out.println("You win!!");
            } else if (opponent.getNumberOfOppCards() == 0) {
                System.out.println("You lose! Try again!");
            }
        }
    }

    private static void attack() {
        String card = "";
        switch (askQuestionL(Visual.attackChoices())) {
            case "1":
                card = player.getPlayerCards()[0];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "2":
                card = player.getPlayerCards()[1];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "3":
                card = player.getPlayerCards()[2];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "4":
                card = player.getPlayerCards()[3];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "5":
                card = player.getPlayerCards()[4];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "6":
                card = player.getPlayerCards()[5];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "7":
                card = player.getPlayerCards()[6];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "8":
                card = player.getPlayerCards()[7];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "9":
                card = player.getPlayerCards()[8];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "10":
                card = player.getPlayerCards()[9];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "11":
                card = player.getPlayerCards()[10];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "12":
                card = player.getPlayerCards()[11];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "13":
                card = player.getPlayerCards()[12];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "14":
                card = player.getPlayerCards()[13];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "15":
                card = player.getPlayerCards()[14];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "16":
                card = player.getPlayerCards()[15];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "17":
                card = player.getPlayerCards()[16];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "18":
                card = player.getPlayerCards()[17];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "19":
                card = player.getPlayerCards()[18];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "20":
                card = player.getPlayerCards()[19];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "21":
                card = player.getPlayerCards()[20];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "22":
                card = player.getPlayerCards()[21];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "23":
                card = player.getPlayerCards()[22];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "24":
                card = player.getPlayerCards()[23];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "25":
                card = player.getPlayerCards()[24];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "26":
                card = player.getPlayerCards()[25];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "27":
                card = player.getPlayerCards()[26];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "28":
                card = player.getPlayerCards()[27];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "29":
                card = player.getPlayerCards()[28];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "30":
                card = player.getPlayerCards()[29];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "31":
                card = player.getPlayerCards()[30];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "32":
                card = player.getPlayerCards()[31];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "33":
                card = player.getPlayerCards()[32];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "34":
                card = player.getPlayerCards()[33];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "35":
                card = player.getPlayerCards()[34];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "36":
                card = player.getPlayerCards()[35];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
            case "37":
                card = player.getPlayerCards()[36];
                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
                break;
        }
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print(opponent.opponentDefend(card));
        player.removeCardFromPlayer(card);
        System.out.printf("\n%sYou take %s%s%s from the deck!%s\n", Color.PURPLE, Color.RESET, colorCard(player.takeCardFromDeck(cardLogic)), Color.PURPLE, Color.RESET);

    }

    private static String defend(String oppCard) {
        String card = "";
        System.out.printf("\n%sThe opponent attacks with %s%s!", Color.GREEN, Color.RESET, colorCard(oppCard));
        switch (askQuestionL(Visual.defendChoices())) {
            case "1":
                card = player.getPlayerCards()[0];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "2":
                card = player.getPlayerCards()[1];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "3":
                card = player.getPlayerCards()[2];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "4":
                card = player.getPlayerCards()[3];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "5":
                card = player.getPlayerCards()[4];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "6":
                card = player.getPlayerCards()[5];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "7":
                card = player.getPlayerCards()[6];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "8":
                card = player.getPlayerCards()[7];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "9":
                card = player.getPlayerCards()[8];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "10":
                card = player.getPlayerCards()[9];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "11":
                card = player.getPlayerCards()[10];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "12":
                card = player.getPlayerCards()[11];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "13":
                card = player.getPlayerCards()[12];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "14":
                card = player.getPlayerCards()[13];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "15":
                card = player.getPlayerCards()[14];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "16":
                card = player.getPlayerCards()[15];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "17":
                card = player.getPlayerCards()[16];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "18":
                card = player.getPlayerCards()[17];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "19":
                card = player.getPlayerCards()[18];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "20":
                card = player.getPlayerCards()[19];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "21":
                card = player.getPlayerCards()[20];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "22":
                card = player.getPlayerCards()[21];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "23":
                card = player.getPlayerCards()[22];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "24":
                card = player.getPlayerCards()[23];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "25":
                card = player.getPlayerCards()[24];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "26":
                card = player.getPlayerCards()[25];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "27":
                card = player.getPlayerCards()[26];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "28":
                card = player.getPlayerCards()[27];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "29":
                card = player.getPlayerCards()[28];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "30":
                card = player.getPlayerCards()[29];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "31":
                card = player.getPlayerCards()[30];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "32":
                card = player.getPlayerCards()[31];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "33":
                card = player.getPlayerCards()[32];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "34":
                card = player.getPlayerCards()[33];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "35":
                card = player.getPlayerCards()[34];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "36":
                card = player.getPlayerCards()[35];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
            case "37":
                card = player.getPlayerCards()[30];
                System.out.printf("%sYou defend with the%s %s\n", Color.BLUE, Color.RESET, colorCard(card));
                break;
        }
        try {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String oppTypeCard = oppCard.substring(0, 1);
            int oppNumberOfCard = CardLogic.returnAsValue(oppCard);
            String typeCard = card.substring(0, 1);
            int numberOfCard = CardLogic.returnAsValue(card);
            if (typeCard.equals(oppTypeCard) && (oppNumberOfCard < numberOfCard)) {
                Card.turn = true;
                player.removeCardFromPlayer(card);
                return String.format("%sYou successfully defend with: %s%s!", Color.BLUE, Color.RESET, colorCard(card));
        } else if (typeCard.equals(kozer.substring(0, 1)) && oppTypeCard.equals(kozer.substring(0, 1))) {
                if (numberOfCard > oppNumberOfCard) {
                    Card.turn = true;
                    player.removeCardFromPlayer(card);
                    return String.format("%sYou successfully defend with: %s%s!", Color.BLUE, Color.RESET, colorCard(card));
                }
            } else if (typeCard.equals(kozer.substring(0, 1))) {
                Card.turn = true;
                player.removeCardFromPlayer(card);
                return String.format("%sYou successfully defend with: %s%s!", Color.BLUE, Color.RESET, colorCard(card));
            }
        } catch (Exception ignored) {

        }
        player.addCard(oppCard);
        opponent.removeCardFromOpponent(oppCard);
        return "You couldn't defend with your cards! You have to take the opponent's card!";
    }

    //returns the card as a color and in sentence form
    public static String colorCard(String card) {
        if (card.charAt(0) == 'h' || card.charAt(0) == 'd') {
            return String.format("%s%s%s", Color.RED, CardLogic.cardInWords(card), Color.RESET);
        } else {
            return String.format("%s%s%s", Color.WHITE, CardLogic.cardInWords(card), Color.RESET);
        }
    }

    //Specifically returns as lower case
    private static String askQuestionL(String ques) {
        System.out.println(ques);
        return scan.nextLine().toLowerCase();
    }
}
