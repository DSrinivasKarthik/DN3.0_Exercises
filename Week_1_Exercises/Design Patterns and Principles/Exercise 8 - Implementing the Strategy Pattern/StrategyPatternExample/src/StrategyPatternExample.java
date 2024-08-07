public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy paypalPayment = new PayPalPayment("user@example.com");
        
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(500);
        
        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.executePayment(300);
    }
}
