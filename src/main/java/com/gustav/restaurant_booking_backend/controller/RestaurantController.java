package com.gustav.restaurant_booking_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RestaurantController {

    @GetMapping("/restaurant")
    public String getRestaurant() {
        return "Hola Mundo";
    }
}
