public class AdapterPatternExample {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePaymentGateway());
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalPaymentGateway());

        stripeProcessor.processPayment("Rs.100");
        paypalProcessor.processPayment("Rs.200");
    }
}
