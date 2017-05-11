package com.tidyjava.locator2;

public class OrderConfirmation {
    private Long orderNumber;
    private String firstName;
    private String email;

    public OrderConfirmation(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void fill(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }
}
