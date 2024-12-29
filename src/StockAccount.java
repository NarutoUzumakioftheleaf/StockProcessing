import java.util.ArrayList;
import java.util.List;

class StockAccount {
    private List<CompanyShares> sharesList;

    public StockAccount() {
        sharesList = new ArrayList<>();
    }

    public void buy(String stockSymbol, int shares) {
        for (CompanyShares share : sharesList) {
            if (share.getStockSymbol().equals(stockSymbol)) {
                share.updateShares(shares);
                return;
            }
        }
        sharesList.add(new CompanyShares(stockSymbol, shares));
    }

    public void sell(String stockSymbol, int shares) {
        for (CompanyShares share : sharesList) {
            if (share.getStockSymbol().equals(stockSymbol)) {
                share.updateShares(-shares);
                return;
            }
        }
        System.out.println("Stock not found: " + stockSymbol);
    }

    public void printStockReport() {
        for (CompanyShares share : sharesList) {
            System.out.println(share);
        }
    }
}