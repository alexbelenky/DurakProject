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
            System.out.printf("%sThe Kozer is: %s%s", Color.YELLOW, Color.RESET, colorKozer());

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


    //Specifically returns as lower case
    private static String askQuestionL(String ques) {
        System.out.println(ques);
        return scan.nextLine().toLowerCase();
    }
    private static String colorKozer() {
        if (kozer.charAt(0) == 'h' || kozer.charAt(0) == 'd') {
            return String.format("%s%s%s", Color.RED, CardLogic.cardInWords(kozer), Color.RESET);
        } else {
            return String.format("%s%s%s", Color.WHITE, CardLogic.cardInWords(kozer), Color.RESET);
        }
    }
}
