package com.tidyjava.locator2;

public class Order {
    private Long number;
    private Long customerId;

    public Order(Long number, Long customerId) {
        this.number = number;
        this.customerId = customerId;
    }

    public void confirm() {
        GossipGirl.getCustomer(customerId).confirm(createConfirmation());
    }

    private OrderConfirmation createConfirmation() {
        return new OrderConfirmation(number);
    }
}
