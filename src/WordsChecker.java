import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        List<String> queue = new LinkedList<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
        for (String w : queue) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
