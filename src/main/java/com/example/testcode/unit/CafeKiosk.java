package com.example.testcode.unit;

import com.example.testcode.unit.beverage.Beverage;
import com.example.testcode.unit.order.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CafeKiosk {
    private final List<Beverage> beverages = new ArrayList<>();

    public void add(Beverage beverage){
        beverages.add(beverage);
    }

    public void remove(Beverage beverage) {
        beverages.remove(beverage);
    }
    public int calculateTotalPrice() {
        int total = 0;
        for (Beverage x : beverages) {
            total += x.getPrice();
        }
        return total;
    }

    public Order createOrder(){
        return new Order(LocalDateTime.now(), beverages);
    }

}
