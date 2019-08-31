/* Module to iterate through all words in the file */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

class WordIterator {
    private String path;

    WordIterator(String pathToFile) {
        path = pathToFile;
    }

    Stream<String> getWords() throws FileNotFoundException {
        ArrayList<String> al = new ArrayList<>();
        File file = new File(path);

        Scanner sc = new Scanner(new FileInputStream(file));
        while (sc.hasNext()) {
            al.add(sc.next().toLowerCase());  // to count same words in both UPPER and lower case as one name
        }
        return al.stream();  // returns number of all words
    }
}
