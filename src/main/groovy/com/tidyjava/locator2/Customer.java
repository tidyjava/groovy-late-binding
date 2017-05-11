package com.tidyjava.locator2;

import static com.tidyjava.locator2.Objects.mailer;

public class Customer {
    private String firstName;
    private String email;

    public Customer(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public void confirm(OrderConfirmation orderConfirmation) {
        orderConfirmation.fill(firstName, email);
        mailer().send(orderConfirmation);
    }
}
