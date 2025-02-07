public class StripeAdapter implements PaymentProcessor {
    private StripeSDK stripeSDK;
    public StripeAdapter(StripeSDK stripeSDK) {
        this.stripeSDK=stripeSDK;
    }

    @Override
    public void processPayment(double amount, String currency) {
        stripeSDK.makePayment(amount, currency);
    }
}
