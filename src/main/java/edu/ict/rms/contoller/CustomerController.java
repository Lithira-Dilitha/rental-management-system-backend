package edu.ict.rms.contoller;

import edu.ict.rms.dto.Customer;
import edu.ict.rms.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer-controller")
public class CustomerController {
    final CustomerService service;
    @PostMapping("/customer")
    void save(@RequestBody Customer customer){
        service.save(customer);
    }
}
