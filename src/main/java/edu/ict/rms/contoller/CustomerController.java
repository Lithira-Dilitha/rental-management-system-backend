package edu.ict.rms.contoller;

import edu.ict.rms.dto.Customer;
import edu.ict.rms.service.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer-controller")
public class CustomerController {
    final CustomerService service;
    @PostMapping("/customer")
    void save(@RequestBody Customer customer){
        service.save(customer);
    }
    @PutMapping("/customer")
    void update(@RequestBody Customer customer){
        service.update(customer);
    }
    @DeleteMapping("/customer/{id}")
    void delete(@PathVariable Long id){
        service.delete(id);
    }
    @GetMapping("/customers")
    List<Customer> getAll(){
        return service.allCustomers();
    }
}
