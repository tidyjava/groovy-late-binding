package com.tidyjava.locator2;

public class Mailer {

    public void send(OrderConfirmation orderConfirmation) {
        System.out.printf("Email to %s:\nHi %s! Your order %s is shipping soon!",
                orderConfirmation.getEmail(),
                orderConfirmation.getFirstName(),
                orderConfirmation.getOrderNumber());
    }
}
