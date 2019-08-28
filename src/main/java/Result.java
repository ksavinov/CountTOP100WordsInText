/* Result data transfer object */
import java.util.ArrayList;
import java.util.HashMap;

public class Result {

    private HashMap<String, Integer> words;

    Result() {
        words = new HashMap<>();
    }

    public int getCount() {
        return words.size();  // number of unique words
    }

    ArrayList<WordData> getTopWords() {
        ArrayList<WordData> w = new ArrayList<>();
        words.entrySet().stream().sorted(new WordComparator()).limit(100).forEach(wd -> w.add(new WordData(wd.getKey(), wd.getValue())));
        return w;
    }

    void pushWord(String w) {
        if (!words.containsKey(w)) {
            words.put(w, 1);
            return;
        }

        int count = words.get(w);
        words.put(w, ++count);
    }

}
