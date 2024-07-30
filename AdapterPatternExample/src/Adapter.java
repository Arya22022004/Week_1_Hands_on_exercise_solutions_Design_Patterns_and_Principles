 class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(String paymentMethod, double amount) {
        payPalGateway.payWithPayPal(paymentMethod, amount);
    }
}

 class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(String paymentMethod, double amount) {
        stripeGateway.chargeWithStripe(paymentMethod, amount);
    }
}

class GooglePayAdapter implements PaymentProcessor {
    private GooglePayGateway googlePayGateway;

    public GooglePayAdapter(GooglePayGateway googlePayGateway) {
        this.googlePayGateway = googlePayGateway;
    }

    @Override
    public void processPayment(String paymentMethod, double amount) {
        googlePayGateway.payWithGooglePay(paymentMethod, amount);
    }
}