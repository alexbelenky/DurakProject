import java.util.Scanner;

public class Card {
    static Scanner scan = new Scanner(System.in);
    static CardLogic cardLogic = new CardLogic();
    static String kozer;
    static boolean turn = true; //true means it is the players turn and false means it is the opponent's
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
        if (turn) {
            attack();
        } else {

        }
    }

    private static void attack() {
        String card = "";
        switch (askQuestionL(Visual.attackChoices())) {
            case "1":
                card = player.getPlayerCards()[0];
                System.out.println("You attack with the " + CardLogic.cardInWords(card));
                break;
            case "2":
                card = player.getPlayerCards()[1];
                System.out.println("You attack with the " + CardLogic.cardInWords(card));
                break;
            case "3":
                card = player.getPlayerCards()[2];
                System.out.println("You attack with the " + CardLogic.cardInWords(card));
                break;
            case "4":
                card = player.getPlayerCards()[3];
                System.out.println("You attack with the " + CardLogic.cardInWords(card));
                break;
            case "5":
                card = player.getPlayerCards()[4];
                System.out.println("You attack with the " + CardLogic.cardInWords(card));
                break;
            case "6":
                card = player.getPlayerCards()[5];
                System.out.println("You attack with the " + CardLogic.cardInWords(card));
                break;
            case "7":
                System.out.println("Sunday");
                break;
        }
        System.out.printf("%sThe opponent defends with : %s%s", Color.BLUE, Color.RESET, colorCard(opponent.opponentDefend(card)));
    }
    //Specifically returns as lower case
    private static String askQuestionL(String ques) {
        System.out.println(ques);
        return scan.nextLine().toLowerCase();
    }

    //returns the card as a color
    private static String colorCard(String card) {
        if (card.charAt(0) == 'h' || card.charAt(0) == 'd') {
            return String.format("%s%s%s", Color.RED, CardLogic.cardInWords(card), Color.RESET);
        } else {
            return String.format("%s%s%s", Color.WHITE, CardLogic.cardInWords(card), Color.RESET);
        }
    }
}
