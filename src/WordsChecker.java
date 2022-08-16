import java.util.*;

public class WordsChecker {
    private String text;
    private Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        this.set = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {

        return set.contains(word);
    }
}
