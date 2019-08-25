import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;

public class ResultPrinterJson implements ResultPrinterInterface {
    @Override
    public void printTotalAmount(Result result) {
        System.out.println(String.format("Total amount of words: %d", result.getCount()));
    }

    @Override
    public void printTopWords(Result result) {
        System.out.println("TOP100 words: ");
        Gson gson = new Gson();
        SortedWordsCollection<String, Integer> m = new SortedWordsCollection<>();
        result.getTopWords().forEach(s -> m.put(s.getWord(), s.getCount()));
        String jsonString = gson.toJson(m);
        System.out.println(jsonString);
    }
}
