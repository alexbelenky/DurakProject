public class Visual {
    private Visual() { }

    public static String welcome() {
        return """
                \\      /\\       /   |¯¯¯¯¯   |         /¯¯¯¯    /¯¯¯¯\\        /\\       /\\      |¯¯¯¯¯ 
                 \\    /  \\     /    |____    |        |        |      |      /   \\    /  \\     |____ 
                  \\  /    \\   /     |        |        |        |      |     /     \\  /    \\    |
                   \\/      \\ /      |_____   |_____    \\____    \\____/     /       \\/      \\   |_____
                """;
    }

    public static String attackChoices() {
        return """
               \nWhat will you put down?\n
               1. Your first card
               2. Your second card
               3. Your third card
               4. Your fourth card
               5. Your fifth card
               6. Your sixth card
                """;
    }

    //shows the player their cards

    public static String showCards(Player player) {
        System.out.println("These are your cards: ");
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < DisplayConstants.NUM_HEIGHT_CHARS; row++) {

            for (String card : player.getPlayerCards()) {
                if (CardLogic.notEmpty(card)) {
                    result.append(showCardRow(row, card));
                    result.append("   ");
                }
            }

            result.append( "\n" );

        }

        return result.toString();
    }


    private static String showCardRow( int row, String card ) {
        StringBuilder result = new StringBuilder();

        if ( isFirstRow(row) || isLastRow(row) ) {

            for (int col = 0; col < DisplayConstants.NUM_WIDTH_CHARS; col++) {
                result.append(DisplayConstants.HORIZONTAL_CHAR);
                result.toString();
            }

        } else {

            result.append( DisplayConstants.VERTICAL_CHAR );

            int col = 2;
            String decoratedCard = decorateSuit(card);

            if ( isSecondRow(row) ) {
                result.append( decoratedCard );
                col += decoratedCard.length();
            }

            for ( ; col < DisplayConstants.NUM_WIDTH_CHARS; col++ ) {
                if ( row == DisplayConstants.NUM_HEIGHT_CHARS - 2 && DisplayConstants.NUM_WIDTH_CHARS - decoratedCard.length() == col) {
                    result.append( decoratedCard );
                    break;
                } else {
                    result.append(" ");
                }
            }

            result.append( DisplayConstants.VERTICAL_CHAR );

        }

        return result.toString();
    }

    private static String decorateSuit(String card) {
        return card
                .replace("h", DisplayConstants.SUIT_HEARTS)
                .replace("c", DisplayConstants.SUIT_CLUBS)
                .replace("s", DisplayConstants.SUIT_SPADES)
                .replace("d", DisplayConstants.SUIT_DIAMONDS);
    }

    private static boolean isFirstRow(int row) {
        return row == 0;
    }

    private static boolean isSecondRow(int row) {
        return row == 1;
    }

    private static boolean isLastRow(int row) {
        return row == (DisplayConstants.NUM_HEIGHT_CHARS - 1);
    }

}
