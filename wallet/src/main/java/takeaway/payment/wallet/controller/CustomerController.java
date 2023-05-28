package takeaway.payment.wallet.controller;

import org.springframework.web.bind.annotation.RestController;
import takeaway.payment.wallet.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import takeaway.payment.wallet.repository.WalletRepository;
import takeaway.payment.wallet.services.CustomerService;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private WalletRepository walletRepository;

    @GetMapping("/api/customer")
    public List<Customer> findAllCustomers() {
        return (List<Customer>)customerService.findAll();
    }

    @GetMapping("/api/customer/{id}")
    public Customer findByCustomerId(@PathVariable Integer id) {
        return customerService.findById(id);
    }

    @PostMapping("/api/customer")
    public Customer createCustomer() {
        Customer customer = customerService.create();
        return customer;
    }
}
