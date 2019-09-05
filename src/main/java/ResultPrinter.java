/* Prints results */

public class ResultPrinter {
    private ResultPrinterInterface printer;

    ResultPrinter(ResultPrinterInterface concretePrinter) {
        printer = concretePrinter;
    }

    public void print(Result result) {
        System.out.println(printer.printTotalAmount(result));
        System.out.println(printer.printTopWords(result));
    }
}
