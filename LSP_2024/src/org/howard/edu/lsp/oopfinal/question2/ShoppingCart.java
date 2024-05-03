package org.howard.edu.lsp.oopfinal.question2;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    
    public ShoppingCart(PaymentStrategy initialPaymentStrategy) {
        this.paymentStrategy = initialPaymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}


