public class StripeAdapter implements PaymentProcessor {
    private StripePaymentGateway stripe;

    public StripeAdapter(StripePaymentGateway stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(String amount) {
        stripe.makePayment(amount);
    }
}
