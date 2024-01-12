import java.util.Scanner;

public class Card {
    static Scanner scan = new Scanner(System.in);

    public Card() { }

    public static void start() {
        System.out.println(Visual.welcome());
        if (askQuestionL("Are you ready to play!? y/n").equals("y")) {
            System.out.println("hi");
        } else {
            System.out.println("Come back later!");
            System.exit(0);
        }
    }


    //Specifically returns as lower case
    private static String askQuestionL(String ques) {
        System.out.println(ques);
        return scan.nextLine().toLowerCase();
    }
}
