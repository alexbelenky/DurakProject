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
            } else {
                String oppCard = opponent.opponentAttack();
//                defend(oppCard);
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
                System.out.println("Sunday");
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

//    private static void defend(String oppCard) {
//        System.out.printf("%sThe opponent attacks with %s%s!", Color.GREEN, Color.RESET, oppCard);
//        switch (askQuestionL(Visual.attackChoices())) {
//            case "1":
//                card = player.getPlayerCards()[0];
//                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
//                break;
//            case "2":
//                card = player.getPlayerCards()[1];
//                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
//                break;
//            case "3":
//                card = player.getPlayerCards()[2];
//                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
//                break;
//            case "4":
//                card = player.getPlayerCards()[3];
//                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
//                break;
//            case "5":
//                card = player.getPlayerCards()[4];
//                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
//                break;
//            case "6":
//                card = player.getPlayerCards()[5];
//                System.out.printf("%sYou attack with the%s %s\n", Color.GREEN, Color.RESET, colorCard(card));
//                break;
//            case "7":
//                System.out.println("Sunday");
//                break;
//        }
//    }

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
