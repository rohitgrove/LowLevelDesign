package models;

import constants.OrderStatus;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private OrderStatus status;
    private Date orderTimestamp;

    private List<Meal> meals;
    private Chef chef;
    private Waiter waiter;

    public boolean addMeal(Meal meal) {
        return true;
    }
    public boolean removeMeal(Meal meal) {
        return true;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getOrderTimestamp() {
        return this.orderTimestamp;
    }

    public void setOrderTimestamp(Date orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public List<Meal> getMeals() {
        return this.meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Chef getChef() {
        return this.chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public Waiter getWaiter() {
        return this.waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}