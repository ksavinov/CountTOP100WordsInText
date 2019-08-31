/* Module to convert output to Json format */
import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResultPrinterJson implements ResultPrinterInterface {
    @Override
    public void printTotalAmount(Result result) {
        /* prints total amount of words */
        System.out.println(String.format("Total amount of words: %d", result.getCount()));
    }

    @Override
    public void printTopWords(Result result) {
        System.out.println("TOP100 words: ");
        Gson gson = new Gson();
        Map<String, Integer> m = new LinkedHashMap<>();
        result.getTopWords().forEach(s -> m.put(s.getWord(), s.getCount()));
        String jsonString = gson.toJson(m);
        System.out.println(jsonString);
    }
}
