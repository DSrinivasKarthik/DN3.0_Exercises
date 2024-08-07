public class WebApp implements Observer {
    @Override
    public void update(String stockPrice) {
        System.out.println("Web App received stock price: " + stockPrice);
    }
}
