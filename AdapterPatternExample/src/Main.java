public class Main {
    public static void main(String[] args) {
        
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();
        GooglePayGateway googlePayGateway = new GooglePayGateway();

        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);
        PaymentProcessor googlePayAdapter = new GooglePayAdapter(googlePayGateway);

        payPalAdapter.processPayment("Credit Card", 100.0);
        stripeAdapter.processPayment("Debit Card", 50.0);
        googlePayAdapter.processPayment("Google Pay Wallet", 200.0);
    }
}