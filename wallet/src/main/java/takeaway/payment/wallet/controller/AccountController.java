package takeaway.payment.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import takeaway.payment.wallet.model.Account;
import takeaway.payment.wallet.services.AccountService;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/api/account")
    public List<Account> findAllAccountInfo() {
        return accountService.findAll();
    }

    @GetMapping("/api/account/{id}")
    public Account findAccountInfoByRestaurantId(@PathVariable Integer id) {
        return accountService.findByRestaurantId(id);
    }
}
