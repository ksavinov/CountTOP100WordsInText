/* Main */
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String pathToFile = "C:\\Users\\Кирилл\\IdeaProjects\\CountingWords\\src\\test.txt";  // type path to your file here
        try {
            Result result = wordService.withInputFile(pathToFile).getResult();
            (new ResultPrinter(new ResultPrinterJson())).print(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
