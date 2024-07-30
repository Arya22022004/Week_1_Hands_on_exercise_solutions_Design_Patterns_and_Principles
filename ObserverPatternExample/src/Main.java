public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("AAPL", 150.0);

        stockMarket.deregisterObserver(webApp);

        stockMarket.setStockPrice("AAPL", 155.0);
    }
}