import java.util.Scanner;

public class Card {
    static Scanner scan = new Scanner(System.in);
    static CardLogic cardLogic = new CardLogic();
    static Player player;
    static Opponent opponent;


    public Card() { }

    public static void start() {
        System.out.println(Visual.welcome());
        if (askQuestionL("Are you ready to play!? y/n").equals("y")) {
            setCards();
            System.out.println(Visual.showCards(player));

        } else {
            System.out.println("Come back later!");
            System.exit(0);
        }
    }

    //sets cards for both player and opponent and picks a kozer
    private static void setCards() {
        String[] playerCards = cardLogic.setPlayerCards();
        player = new Player(playerCards);
        String[] opponentCards = cardLogic.setPlayerCards();
        opponent = new Opponent(opponentCards);

    }


    //Specifically returns as lower case
    private static String askQuestionL(String ques) {
        System.out.println(ques);
        return scan.nextLine().toLowerCase();
    }
}
