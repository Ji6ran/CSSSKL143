/**
 * Created by Jibran on 6/4/19.
 */
import java.util.*;
public class QuizTracker implements Cloneable {
    ArrayList<QuizScore> quizScores = new ArrayList<QuizScore>();

    public void add(QuizScore s) {
        quizScores.add(s);
    }

    public Object clone() throws CloneNotSupportedException {
        ArrayList<QuizScore> copy = new ArrayList<QuizScore>();
        for(QuizScore el : quizScores) {
            copy.add(el.clone());
        }

        return copy;
    }
}
