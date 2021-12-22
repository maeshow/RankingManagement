import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RankingScore {
    private List<Score> scores;

    public RankingScore() {
        scores = new ArrayList<>();
    }

    public void entryScore(int point, String name) {
        scores.add(new Score(point, name));
    }

    public void printRanking() {
        Collections.sort(
                scores,
                new Comparator<Score>() {
                    @Override
                    public int compare(Score score1, Score score2) {
                        return score2.getPoint() - score1.getPoint();
                    }
                });
        for (int i = 0; i < scores.size(); i++) {
            Score score = scores.get(i);
            Messages.showFormattedMessage(Messages.SCORE_RANKING, i + 1, score.getName(), score.getPoint());
        }
    }
}
