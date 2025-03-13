package models;

public class RestaurantSystem {
    private Restaurant restaurant;

    public static RestaurantSystem restaurantSystemInstance = null;

    private RestaurantSystem() {
    }

    public static RestaurantSystem getInstance() {
        if (restaurantSystemInstance == null) {
            restaurantSystemInstance = new RestaurantSystem();
        }
        return restaurantSystemInstance;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
