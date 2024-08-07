public class MobileApp implements Observer {
    @Override
    public void update(String stockPrice) {
        System.out.println("Mobile App received stock price: " + stockPrice);
    }
}
