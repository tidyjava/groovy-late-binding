package com.tidyjava.locator2;

public class Objects {
    private static Mailer mailer;
    private static CustomerRepository customerRepository;

    public static Mailer mailer() {
        return mailer;
    }

    public static void setMailer(Mailer mailer) {
        Objects.mailer = mailer;
    }

    public static Customer customer(Long id) {
        return customerRepository.findById(id);
    }

    public static void setCustomerRepository(CustomerRepository customerRepository) {
        Objects.customerRepository = customerRepository;
    }
}
