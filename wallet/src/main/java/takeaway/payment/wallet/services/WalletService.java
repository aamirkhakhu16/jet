package takeaway.payment.wallet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import takeaway.payment.wallet.model.Wallet;
import takeaway.payment.wallet.repository.WalletRepository;

import java.util.List;

@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    public Wallet findByCustomerId(Integer id) {
        return walletRepository.findByCustomerId(id);
    }

    public List<Wallet> findAll() {
        return (List<Wallet>) walletRepository.findAll();
    }

    public Wallet create(Wallet wallet) {
        return walletRepository.save(wallet);
    }
}
