/* Reads file and returns words quantity */
import java.io.FileNotFoundException;

class WordService {

    private String pathToFile;

    WordService withInputFile(String pathToFile) {
        this.pathToFile = pathToFile;

        return this;
    }

    Result getResult() throws FileNotFoundException {
        Result result = new Result();
        WordIterator wi = new WordIterator(pathToFile);
        wi.getWords().forEach(result::pushWord);  // selects unique words

        return result;
    }
}
