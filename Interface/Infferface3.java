interface Payment {
    void initiatePayment(double amount);
    void getPaymentStatus();
}

class CreditCard implements Payment {
    public void initiatePayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }

    public void getPaymentStatus() {
        System.out.println("Credit Card payment successful!");
    }
}

class PayPal implements Payment {
    public void initiatePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    public void getPaymentStatus() {
        System.out.println("PayPal payment successful!");
    }
}

public class Infferface3 {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCard();
        Payment paypalPayment = new PayPal();

        
        creditCardPayment.initiatePayment(50.0);
        creditCardPayment.getPaymentStatus();

        paypalPayment.initiatePayment(30.0);
        paypalPayment.getPaymentStatus();
    }
}
