package com.arjun.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {

    private List<FoodItemsDTO> foodItemsList;
    private Integer userId;
    private Restaurant restaurant;
    // Manually added getters
    public List<FoodItemsDTO> getFoodItemsList() {
        return foodItemsList;
    }

    public Integer getUserId() {
        return userId;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

}