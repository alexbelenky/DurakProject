public class Main {
    public static void main(String[] args) {
        CardLogic abb = new CardLogic();
        for (String card : abb.getCards()) {
            System.out.print(card + " ");
        }
        System.out.println(" ");
        abb.removeCard("hK");
        for (String card : abb.getCards()) {
            System.out.print(card + " ");
        }
    }
}