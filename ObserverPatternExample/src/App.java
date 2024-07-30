class MobileApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("Mobile App: " + stockName + " price updated to " + price);
    }
}
class WebApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("Web App: " + stockName + " price updated to " + price);
    }
}