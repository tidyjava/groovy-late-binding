package com.tidyjava.locator2;

public class Application {

    public static void main(String[] args) {
        Objects.setMailer(new Mailer());
        Objects.setCustomerRepository(new CustomerRepository());

        new Order(1L, 2L).confirm();
    }
}
