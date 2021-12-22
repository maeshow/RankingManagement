public class App {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        Ranking ranking = new Ranking();
        ranking.entryScore(300);
        ranking.entryScore(100);
        ranking.entryScore(400);
        ranking.entryScore(200);
        ranking.printRanking();
    }

    private static void task2() {
        RankingScore ranking = new RankingScore();
        ranking.entryScore(300, "name300");
        ranking.entryScore(100, "name100");
        ranking.entryScore(400, "name400");
        ranking.entryScore(200, "name200");
        ranking.printRanking();
    }
}
