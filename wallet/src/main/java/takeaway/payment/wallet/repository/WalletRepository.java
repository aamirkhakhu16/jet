package takeaway.payment.wallet.repository;

import org.springframework.data.repository.CrudRepository;
import takeaway.payment.wallet.model.Customer;
import takeaway.payment.wallet.model.Wallet;

public interface WalletRepository extends CrudRepository<Wallet, Integer> {

    Wallet findByCustomerId(Integer id);
}
