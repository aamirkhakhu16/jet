package takeaway.payment.wallet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import takeaway.payment.wallet.model.Account;
import takeaway.payment.wallet.model.Restaurant;
import takeaway.payment.wallet.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private AccountService accountService;

    public Restaurant create() {
        Restaurant restaurant = new Restaurant();
        restaurant = restaurantRepository.save(restaurant);
        Account account = new Account();
        account.setRestaurant(restaurant);
        account.setBalance(0F);
        accountService.create(account);
        return restaurant;
    }

    public List<Restaurant> findAll() {
        return (List<Restaurant>) restaurantRepository.findAll();
    }

    public Restaurant findById(Integer id) {
        return restaurantRepository.findById(id).get();
    }
}
