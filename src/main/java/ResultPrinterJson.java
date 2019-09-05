/* Module to convert output to Json format */
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResultPrinterJson implements ResultPrinterInterface {
    @Override
    public String printTotalAmount(Result result) {
        /* prints total amount of words */
        return String.format("Total amount of words: %d", result.getCount());
    }

    @Override
    public String printTopWords(Result result) {
        System.out.println("TOP100 words: ");
        Gson gson = new Gson();
        Map<String, Integer> m = new LinkedHashMap<>();
        result.getTopWords().forEach(s -> m.put(s.getWord(), s.getCount()));
        return gson.toJson(m);
    }
}
