package takeaway.payment.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import takeaway.payment.wallet.model.Customer;
import takeaway.payment.wallet.model.Wallet;
import takeaway.payment.wallet.services.WalletService;

import java.util.List;

@RestController
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping("/api/wallet")
    public List<Wallet> findAllWalletInfo() {
        return (List<Wallet>)walletService.findAll();
    }

    @GetMapping("/api/wallet/{id}")
    public Wallet findWalletInfoByCustomerId(@PathVariable Integer id) {
        return walletService.findByCustomerId(id);
    }
}
