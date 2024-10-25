package com.gustav.restaurant_booking_backend.controller;

import com.gustav.restaurant_booking_backend.dto.RestaurantDTO;
import com.gustav.restaurant_booking_backend.model.RestaurantEntity;
import com.gustav.restaurant_booking_backend.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/all-restaurant")
    public String getRestaurant() {
        return "Hola Mundo";
    }

    @PostMapping("/add-restaurant")
    public ResponseEntity<String> addRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
        try {
            restaurantService.convertToEntity(restaurantDTO);

            return ResponseEntity
                    .status(201)
                    .body("Restaurant added successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body("Failed to add restaurant" + e.getMessage());
        }
    }
}


