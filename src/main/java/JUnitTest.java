import org.junit.Assert;
import org.junit.Test;


public class JUnitTest {

    @Test
    public void shouldAnalyseHappyMessageTest() throws Exception {
        Result result = new Result();
        /////////////////////////////////////////
        // pushes word "c" 8 times to the HashMap
        // pushes word "a" 5 times to the HashMap
        // pushes word "b" 3 times to the HashMap
        result.pushWord("a");
        result.pushWord("a");
        result.pushWord("a");
        result.pushWord("a");
        result.pushWord("a");
        result.pushWord("b");
        result.pushWord("b");
        result.pushWord("b");
        result.pushWord("c");
        result.pushWord("c");
        result.pushWord("c");
        result.pushWord("c");
        result.pushWord("c");
        result.pushWord("c");
        result.pushWord("c");
        result.pushWord("c");
        (new ResultPrinter(new ResultPrinterJson())).print(result);

        Assert.assertEquals("{\"c\":8,\"a\":5,\"b\":3}", (new ResultPrinterJson()).printTopWords(result));
    }
}
