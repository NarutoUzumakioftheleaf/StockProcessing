public class CommercialDataProcessing {
    public static void main(String[] args) {
        StockAccount account = new StockAccount();
        account.buy("AAPL", 10);
        account.buy("GOOG", 5);
        account.sell("AAPL", 2);
        account.printStockReport();
    }
}
