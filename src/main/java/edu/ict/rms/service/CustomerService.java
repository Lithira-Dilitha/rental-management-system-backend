package edu.ict.rms.service;

import edu.ict.rms.dto.Customer;

public interface CustomerService {
    void save(Customer customer);
    void update(Customer customer);
    void delete(Long id);
}
