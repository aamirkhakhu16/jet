package takeaway.payment.wallet.repository;

import org.springframework.data.repository.CrudRepository;
import takeaway.payment.wallet.model.Customer;
import takeaway.payment.wallet.model.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
}
