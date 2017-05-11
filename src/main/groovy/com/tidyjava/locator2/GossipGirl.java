package com.tidyjava.locator2;

public class GossipGirl {
    private static Mailer mailer;
    private static CustomerRepository customerRepository;

    public static Mailer getMailer() {
        return mailer;
    }

    public static void setMailer(Mailer mailer) {
        GossipGirl.mailer = mailer;
    }

    public static Customer getCustomer(Long id) {
        return customerRepository.findById(id);
    }

    public static void setCustomerRepository(CustomerRepository customerRepository) {
        GossipGirl.customerRepository = customerRepository;
    }
}
