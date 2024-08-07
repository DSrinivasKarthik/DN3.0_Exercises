public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();
        
        stockMarket.register(mobileApp);
        stockMarket.register(webApp);
        
        stockMarket.setStockPrice("Rs 1000");
        
        stockMarket.deregister(mobileApp);
        
        stockMarket.setStockPrice("Rs 1500");
    }
}
