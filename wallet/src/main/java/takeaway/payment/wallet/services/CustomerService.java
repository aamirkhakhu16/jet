package takeaway.payment.wallet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import takeaway.payment.wallet.model.Customer;
import takeaway.payment.wallet.model.Wallet;
import takeaway.payment.wallet.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private WalletService walletService;

    public Customer create() {
        Customer customer = new Customer();
        customer = customerRepository.save(customer);
        Wallet wallet = new Wallet();
        wallet.setCustomer(customer);
        wallet.setBalance(0F);
        walletService.create(wallet);
        return customer;
    }

    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer findById(Integer id) {
        return customerRepository.findById(id).get();
    }
}
