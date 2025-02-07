public class PayPalAdapter implements PaymentProcessor {

    private PayPalSDK payPalSDK;
    public PayPalAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void processPayment(double amount, String currency) {
        payPalSDK.pay(amount, currency);
    }
}
