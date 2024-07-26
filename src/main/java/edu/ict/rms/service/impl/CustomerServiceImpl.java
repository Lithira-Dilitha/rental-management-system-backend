package edu.ict.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ict.rms.dto.Customer;
import edu.ict.rms.entity.CustomerEntity;
import edu.ict.rms.repository.CustomerRepository;
import edu.ict.rms.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final ObjectMapper mapper;
    final CustomerRepository repository;
    @Override
    public void save(Customer customer) {
        repository.save(mapper.convertValue(customer, CustomerEntity.class));
    }

    @Override
    public void update(Customer customer) {
        repository.save(mapper.convertValue(customer, CustomerEntity.class));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
