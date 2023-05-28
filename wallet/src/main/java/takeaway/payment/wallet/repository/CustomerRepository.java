package takeaway.payment.wallet.repository;

import org.springframework.data.repository.CrudRepository;
import takeaway.payment.wallet.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
