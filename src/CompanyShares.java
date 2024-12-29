import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CompanyShares {
    private String stockSymbol;
    private int numberOfShares;
    private Date dateTime;

    public CompanyShares(String stockSymbol, int numberOfShares) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.dateTime = new Date();
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void updateShares(int shares) {
        this.numberOfShares += shares;
        this.dateTime = new Date();
    }

    @Override
    public String toString() {
        return "Stock Symbol: " + stockSymbol + ", Shares: " + numberOfShares + ", Date: " + dateTime;
    }
}
