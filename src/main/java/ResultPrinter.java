/* Prints results */

public class ResultPrinter {
    private ResultPrinterInterface printer;

    ResultPrinter(ResultPrinterInterface concretePrinter) {
        printer = concretePrinter;
    }

    public void print(Result result) {
        printer.printTotalAmount(result);
        printer.printTopWords(result);
    }
}
