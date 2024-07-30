class PayPalGateway {
    public void payWithPayPal(String paymentMethod, double amount) {
        System.out.println("Processing payment of RS." + amount + " using PayPal with " + paymentMethod);
    }
}

class StripeGateway {
    public void chargeWithStripe(String paymentMethod, double amount) {
        System.out.println("Processing payment of RS." + amount + " using Stripe with " + paymentMethod);
    }
}

class GooglePayGateway {
    public void payWithGooglePay(String paymentMethod, double amount) {
        System.out.println("Processing payment of RS." + amount + " using Google Pay with " + paymentMethod);
    }
}

class ApplePayGateway {
    public void payWithApplePay(String paymentMethod, double amount) {
        System.out.println("Processing payment of RS." + amount + " using Apple Pay with " + paymentMethod);
    }
}