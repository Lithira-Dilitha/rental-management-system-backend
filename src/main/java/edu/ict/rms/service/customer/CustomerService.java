package edu.ict.rms.service.customer;

import edu.ict.rms.dto.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    void update(Customer customer);
    void delete(Long id);
    List<Customer>allCustomers();
}
