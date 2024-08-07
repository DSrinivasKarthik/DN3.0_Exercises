public class PayPalAdapter implements PaymentProcessor {
    private PayPalPaymentGateway paypal;

    public PayPalAdapter(PayPalPaymentGateway paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(String amount) {
        paypal.sendPayment(amount);
    }
}
