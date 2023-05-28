package takeaway.payment.wallet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import takeaway.payment.wallet.model.Account;
import takeaway.payment.wallet.repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account findByRestaurantId(Integer id) {
        return accountRepository.findByRestaurantId(id);
    }

    public List<Account> findAll() {
        return (List<Account>) accountRepository.findAll();
    }

    public Account create(Account account) {
        return accountRepository.save(account);
    }
}
