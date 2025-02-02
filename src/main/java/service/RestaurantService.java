package service;

import java.util.List;

import models.Restaurant;

public interface RestaurantService {
	boolean addRestaurant(Restaurant res);
	void updateRestaurant(Restaurant res);
	boolean deleteRestaurant(int idRes);
	List <Restaurant> retrieveRestaurant();
	Restaurant retrieveRestaurant(int restaurant);
}
