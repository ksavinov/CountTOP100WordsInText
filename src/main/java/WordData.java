/* Word name and its frequency */

public class WordData {
    private String word;
    private Integer count;

    WordData(String w, Integer c) {
        word = w;
        count = c;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
