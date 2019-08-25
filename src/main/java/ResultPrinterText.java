public class ResultPrinterText implements ResultPrinterInterface {
    @Override
    public void printTotalAmount(Result result) {
        System.out.print(String.format("Unique words: %d", result.getCount()));
        System.out.println(result.getCount());
    }

    @Override
    public void printTopWords(Result result) {
        System.out.println("Top 100 most popular words:");
        int rank = 0;
        for (WordData wordData : result.getTopWords()) {
            System.out.println(String.format("%d : %s (%d)", ++rank, wordData.getWord(), wordData.getCount()));
        }
    }
}
