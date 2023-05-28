package takeaway.payment.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import takeaway.payment.wallet.model.Restaurant;
import takeaway.payment.wallet.services.RestaurantService;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/api/restaurant")
    public List<Restaurant> findAllRestaurants() {
        return restaurantService.findAll();
    }

    @GetMapping("/api/restaurant/{id}")
    public Restaurant findByRestaurantId(@PathVariable Integer id) {
        return restaurantService.findById(id);
    }

    @PostMapping("/api/restaurant")
    public Restaurant createRestaurant() {
        return restaurantService.create();
    }
}
