package com.tidyjava.locator2;

public class Customer {
    private String firstName;
    private String email;

    public Customer(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public void confirm(OrderConfirmation orderConfirmation) {
        orderConfirmation.fill(firstName, email);
        GossipGirl.getMailer().send(orderConfirmation);
    }
}
