import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ranking {
    private List<Integer> points;

    public Ranking() {
        points = new ArrayList<>();
    }

    public void entryScore(int point) {
        points.add(point);
    }

    public void printRanking() {
        Collections.sort(points, Collections.reverseOrder());
        for (int i = 0; i < points.size(); i++) {
            Messages.showFormattedMessage(Messages.RANKING, i + 1, points.get(i));
        }
    }
}
