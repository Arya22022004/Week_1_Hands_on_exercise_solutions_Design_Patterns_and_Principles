import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockName;
    private double price;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

    public void setStockPrice(String stockName, double price) {
        notifyObservers(stockName, price);
    }
}