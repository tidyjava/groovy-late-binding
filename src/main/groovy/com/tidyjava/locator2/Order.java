package com.tidyjava.locator2;

import static com.tidyjava.locator2.Objects.customer;

public class Order {
    private Long number;
    private Long customerId;

    public Order(Long number, Long customerId) {
        this.number = number;
        this.customerId = customerId;
    }

    public void confirm() {
        customer(customerId).confirm(createConfirmation());
    }

    private OrderConfirmation createConfirmation() {
        return new OrderConfirmation(number);
    }
}
