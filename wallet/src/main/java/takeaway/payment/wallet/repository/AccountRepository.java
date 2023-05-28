package takeaway.payment.wallet.repository;

import org.springframework.data.repository.CrudRepository;
import takeaway.payment.wallet.model.Account;
import takeaway.payment.wallet.model.Customer;
import takeaway.payment.wallet.model.Wallet;

public interface AccountRepository extends CrudRepository<Account, Integer> {

    Account findByRestaurantId(Integer id);
}
