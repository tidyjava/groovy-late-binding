package com.tidyjava.locator2;

public class Application {

    public static void main(String[] args) {
        GossipGirl.setMailer(new Mailer());
        GossipGirl.setCustomerRepository(new CustomerRepository());

        new Order(1L, 2L).confirm();
    }
}
