/**
 * Created by Jibran on 6/4/19.
 */
public class QuizScore implements Cloneable {
    private int score;

    public QuizScore(int score) {
        this.score = score;
    }

    public QuizScore(QuizScore other) {
        this.score = other.score;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public QuizScore clone() {
        return new QuizScore(this);
    }
}
