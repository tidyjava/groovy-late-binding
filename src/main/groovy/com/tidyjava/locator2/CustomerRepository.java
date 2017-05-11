package com.tidyjava.locator2;

public class CustomerRepository {
    public Customer findById(Long id) {
        return new Customer("John", "john@doe.com");
    }
}
