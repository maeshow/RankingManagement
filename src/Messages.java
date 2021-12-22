public class Messages {
    public static final String RANKING = "%d 位： %d%n";
    public static final String SCORE_RANKING = "%d 位： %s %d%n";

    public static void showFormattedMessage(String message, int a, int b) {
        System.out.format(message, a, b);
    }

    public static void showFormattedMessage(String message, int a, String b, int c) {
        System.out.format(message, a, b, c);
    }
}
