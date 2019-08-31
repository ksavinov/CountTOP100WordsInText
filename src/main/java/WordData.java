/* Word name and its frequency */

public class WordData {
    private String word;
    private Integer count;

    WordData(String w, Integer c) {
        word = w;
        count = c;
    }

    public Integer getCount() {
        return count;
    }

    public String getWord() {
        return word;
    }
}
