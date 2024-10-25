package com.gustav.restaurant_booking_backend.service;

import com.gustav.restaurant_booking_backend.dto.RestaurantDTO;
import com.gustav.restaurant_booking_backend.model.RestaurantEntity;
import com.gustav.restaurant_booking_backend.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public interface RestaurantService {

    RestaurantEntity addRestaurant(RestaurantDTO restaurantDTO);
    RestaurantEntity updateRestaurant(RestaurantDTO restaurantDTO);
    RestaurantEntity getRestaurantById(Long id);
    List<RestaurantEntity> getAllRestaurants();
    RestaurantEntity deleteRestaurant(Long id);
    RestaurantDTO getRestaurantDTOById(Long id);
    RestaurantEntity convertToEntity(RestaurantDTO dto);
}
