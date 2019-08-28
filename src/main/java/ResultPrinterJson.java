/* Module to convert output to Json format */
import com.google.gson.Gson;

import java.util.HashMap;

public class ResultPrinterJson implements ResultPrinterInterface {
    @Override
    public void printTotalAmount(Result result) {
        /* prints total amount of words */
        System.out.println(String.format("Total amount of words: %d", result.getCount()));
    }

    @Override
    public void printTopWords(Result result) {
        /* prints TOP 100 words in Json format */
        System.out.println("Top 100 most popular words: ");
        Gson gson = new Gson();
        HashMap<String, Integer> m = new HashMap<>();
        result.getTopWords().forEach(s -> m.put(s.getWord(), s.getCount()));
        String jsonString = gson.toJson(m);
        System.out.println(jsonString);
    }
}
