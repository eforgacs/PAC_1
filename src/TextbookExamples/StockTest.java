package TextbookExamples;

public class StockTest {
    public static void main(String[] args) {
        Stock myStock = new Stock("ORCL", "Oracle Corporation");
        myStock.previousClosingPrice = 34.5;
        myStock.currentPrice = 34.35;
        System.out.println(myStock.getChangePercent());
        Object[] myObjectArray = new Object[50];
        myObjectArray[0] = 5;
    }


}
